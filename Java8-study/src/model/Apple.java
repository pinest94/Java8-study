package model;

public class Apple {

	private int weight;

	private int price;

	private String color;

	public Apple(int weight, int price, String color) {
		this.weight = weight;
		this.price = price;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple{" +
				"weight=" + weight +
				", price=" + price +
				", color='" + color + '\'' +
				'}';
	}
}
