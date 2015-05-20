package es.corpme.mule.db;

public class Page {
	private static final Integer MAX_PAGE_SIZE= 50;
	
	int page;
	int size;
	
	public Page() {
		this.page= 0;
		this.size= MAX_PAGE_SIZE;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = Math.max(page, 0);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = Math.max(0, Math.min(size, MAX_PAGE_SIZE));
	}

	@Override
	public String toString() {
		return "Page [page=" + page + ", size=" + size + "]";
	}
	
	
}
