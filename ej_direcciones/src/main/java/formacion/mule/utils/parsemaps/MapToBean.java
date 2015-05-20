package formacion.mule.utils.parsemaps;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import formacion.mule.utils.parsemaps.annotations.Map2BeanPropSetter;

public class MapToBean {

	static class PropSetter {
		Method m;
		String key;

		PropSetter(Method m, String key) {
			this.m = m;
			this.key = key;
		}

		void invoke(Object instance, Map<String, ?> in) {
			try {
				m.invoke(instance, in.get(key));
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				throw new RuntimeException(e.getMessage(), e);
			}
		}
	}

	static class BeanProcessor {
		final ArrayList<PropSetter> propSetters = new ArrayList<PropSetter>();

		void addPropSetter(Method m, String key) {
			propSetters.add(new PropSetter(m, key));
		}

		Object processBean(Object instance, Map<String, ?> in) {
			for (PropSetter p : propSetters) {
				p.invoke(instance, in);
			}
			return instance;
		}
	}
	
	final static HashMap<Class<?>, BeanProcessor> processorsCache = new HashMap<Class<?>, BeanProcessor>();

	public <T> List<T> mapListToBeanList(Class<?> T, List<Map<String, ?>> in) {
		if (in != null) {
			final List<T> out = new ArrayList<T>();
			for (Map<String, ?> m : in) {
				out.add((T) mapToBean(T, m));
			}
			return out;
		} else {
			return null;
		}
	}

	public <T> T mapToBean(Class<?> T, Map<String, ?> in) {
		try {
			BeanProcessor bp =  processorsCache.get(T);
			if (bp==null) {
				bp = new BeanProcessor();
				for (Method m : T.getMethods()) {
					final Map2BeanPropSetter s = m
							.getAnnotation(Map2BeanPropSetter.class);
					if (s != null) {
						bp.addPropSetter(m, s.key());
					}
				}
				processorsCache.put(T, bp);
			}
			final Object instance = T.newInstance();
			return (T)bp.processBean(instance, in);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (InstantiationException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
