package by.htp.homework.taskClasses;

public class Book {

	private int id;
	private String name;
	private String autor;
	private String publisher;
	private String year;
	private int quantityPage;
	private int price;
	private String coverType;
	

	public Book(int id, String name, String autor, String publisher, String year, int quantityPage, int price, String coverType) {
		super();
		this.id = id;
		this.name = name;
		this.autor = autor;
		this.publisher = publisher;
		this.year = year;
		this.quantityPage = quantityPage;
		this.price = price;
		this.coverType = coverType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getQuantityPage() {
		return quantityPage;
	}

	public void setQuantityPage(int quantityPage) {
		this.quantityPage = quantityPage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	@Override
	public String toString() {
		return "name: " + this.name + "; autor: " + this.autor + "; publisher: " + this.publisher+ "; year: " + this.year + "; price: " + this.price + "; id: " + this.id+ "; pages: " + this.quantityPage + "; cover: " + this.coverType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((coverType == null) ? 0 : coverType.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + quantityPage;
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (coverType == null) {
			if (other.coverType != null)
				return false;
		} else if (!coverType.equals(other.coverType))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (quantityPage != other.quantityPage)
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

}
