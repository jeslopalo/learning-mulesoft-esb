package batch_examples;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class BussinesLogic {

	final static Logger LOG = Logger.getLogger(BussinesLogic.class);
	final static HashMap<String, Integer> REGS = new HashMap<String, Integer>();

	public static void logic(String name, int freq) {
		synchronized (REGS) {
			Integer i = REGS.get(name);
			if (i == null) {
				REGS.put(name, 1);
			} else {
				if (i % freq == 0) {
					LOG.info("Bussiness Logic " + name + " executed " + i
							+ " times");
				}
				REGS.put(name, i + 1);
			}
		}
	}
}
