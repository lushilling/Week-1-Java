
public class Media extends Items implements CRUD {
	private String publishDate;
	private String artist;

	public Media(String name, String publisherDate, String publishDate, String artist) {
		super(name);
		this.publishDate = publishDate;
		this.artist = artist;
		// TODO Auto-generated constructor stub
	}

	public String getPublisheDate() {
		return publishDate;
	}

	public String getArtist() {
		return artist;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public void setArtist(String artist) {
		this.artist = artist;
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
