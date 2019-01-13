
public class BubbleTea {
	private double price;
	private String flavor;
	private String type;
	private String size;

	public BubbleTea(double price, String flavor, String type, String size) {
		this.price=price;
		this.flavor=flavor;
		this.type=type;
		this.size=size;
		}

	public double getprice() {
		return this.price;
	}
	public String getflavor() {
		return this.flavor;
	}
	public String gettype() {
		return this.type;
	}
	public String getsize() {
		return this.size;
	}
	}


