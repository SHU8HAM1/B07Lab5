public class Circle {
	Point center;
	double radius;
	
	public Circle(Point c, double r) {
		center = c;
		radius = r;
	}
	
	public double perimeter() {
		return 2 * radius * 3.14159;
	}
	
	public double area() {
		return radius * radius * 3.14159;
	}
}
