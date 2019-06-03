
public class Book extends Items implements CRUD {
	private int pageNo;
	private String author;

	public Book(String name, int pageNo, String author) {
		super(name);
		this.pageNo = pageNo;
		this.author = author;
	}

	public int getPageNo() {
		return pageNo;
	}

	public String getAuthor() {
		return author;
	}

	public void SetPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

	}

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
