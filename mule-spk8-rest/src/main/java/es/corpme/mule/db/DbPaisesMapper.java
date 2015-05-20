package es.corpme.mule.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DbPaisesMapper {
	
	public Result<Pais> map(Page page, LinkedList<Map<String, ?>> rows) {
		
		final Result<Pais> results= new Result<>(page);
		final List<Pais> paises= new ArrayList<>();
		
		for (Map<String, ?> row : rows) {
			final Pais pais= new Pais();
			pais.setId((BigDecimal) row.get("ID_ISO"));
			pais.setIsoCode((String) row.get("COD_ISO"));
			pais.setName((String) row.get("NOMBRE"));
			paises.add(pais);
		}
		
		results.setResults(paises);
		
		return results;
	}
}
