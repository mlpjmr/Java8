package lets_get_certified.collections;

public class Book {

	private double price;
    private String title;

    public Book(String title, double price) {
        this.price  = price;
        this.title = title;
    }

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + ", title=" + title + "]";
	}
}
