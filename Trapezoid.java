public class Trapezoid {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Trapezoid(Point A, Point B, Point C, Point D) {
		//Assume this would be a valid trapezoid with AB, BC, CD, and DA as sides.
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	private boolean isParallel(Point A, Point B, Point C, Point D) {
		//Comparing slopes between AB and CD.
		return (A.y - B.y) * (C.x - D.x) == (A.x - B.x) * (C.y - D.y);
	}
	
	public boolean isIsosceles() {
		//Check if there is a pair of parallel opposite sides and the non-parallel sides are equal in length.
		if(A.distance(B) == C.distance(D) && !isParallel(A,B,C,D) && isParallel(A,C,B,D)) {
			return true;
		}
		if(B.distance(C) == A.distance(D) && !isParallel(A,D,C,B) && isParallel(A,B,C,D)) {
			return true;
		}
		return false;
	}
	
}
