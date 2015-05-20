package es.corpme.mule.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Result<T> {

	private Page page;
	private List<T> results;
	
	public Result() {
		
	}
	
	public Result(final Page page, Collection<T> results) {
		this.page= page;
		this.results= new ArrayList<>(results);
	}

	public Result(final Page page) {
		this.page= page;
		this.results= new ArrayList<>();
	}
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Result [page=" + page + ", results=" + results + "]";
	}	
	
	
}
