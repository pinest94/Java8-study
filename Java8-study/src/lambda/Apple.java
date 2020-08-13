package lambda;

public class Apple {

	private int weight;

	private int price;

	public Apple(int weight, int price) {
		this.weight = weight;
		this.price = price;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", price=" + price + "]";
	}
}
