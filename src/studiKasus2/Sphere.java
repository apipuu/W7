package studiKasus2;

public class Sphere extends Shape {
	private double radius;
	public Sphere(double r) {
		super("Sphere");
		radius=r;
	}
	@Override
	public double area() {
		return 4 * Math.PI*radius*radius;
	}
	public String toString() {
		return super.toString() + ", radius : " + radius;
	}
}
