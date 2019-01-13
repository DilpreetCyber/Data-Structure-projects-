
public class Book {
	double price;
	String name;
	Book leftChild;
	Book rightChild;

	public Book(double price, String name) {
		this.price = price;
		this.name = name;
		}

	public String toString() {
		return name + " book has a price of " + price;
		}
	}


