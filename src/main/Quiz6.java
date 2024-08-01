package main;

public class Quiz6 {

	public static void main(String[] args) {

		BallPen ballPen = new BallPen(2, "100%", "파랑색");
		GoodPen goodPen = new GoodPen(3, "80%", "몽블랑");

	}

}

class Pen {
	int thickness;
	String inkAmount;

	public Pen(int thickness, String inkAmount) {
		super();
		this.thickness = thickness;
		this.inkAmount = inkAmount;
	}
}

class BallPen extends Pen {

	String color;

	public BallPen(int thickness, String inkAmount, String color) {
		super(thickness, inkAmount);
		this.color = color;
	}

}

class GoodPen extends Pen {
	
	String brand;

	public GoodPen(int thickness, String inkAmount, String brand) {
		super(thickness, inkAmount);
		this.brand = brand;
	}
	
}