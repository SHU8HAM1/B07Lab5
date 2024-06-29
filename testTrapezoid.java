import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testTrapezoid {

	@Test
	void testPerimeter() {
		Point A = new Point(0,0);
		Point B = new Point(6,0);
		Point C = new Point(5,2);
		Point D = new Point(1,2);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertEquals(t.perimeter(), A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A));
	}
	
	@Test 
	void testIsIsosceles1() {
		Point A = new Point(0,0);
		Point B = new Point(6,0);
		Point C = new Point(5,2);
		Point D = new Point(1,2);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertTrue(t.isIsosceles());
	}
	
	@Test 
	void testIsIsosceles2() {
		Point A = new Point(0,0);
		Point B = new Point(6,0);
		Point C = new Point(5,2);
		Point D = new Point(2,2);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertFalse(t.isIsosceles());
	}
	
	@Test 
	void testIsIsosceles3() {
		Point C = new Point(0,0);
		Point A = new Point(0,6);
		Point B = new Point(1,5);
		Point D = new Point(1,1);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertTrue(t.isIsosceles());
	}
	
	@Test 
	void testIsIsosceles4() {
		Point A = new Point(0,0);
		Point B = new Point(1,0);
		Point C = new Point(1,1);
		Point D = new Point(2,1);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertFalse(t.isIsosceles());
	}
	
	@Test 
	void testIsIsosceles5() {
		Point C = new Point(0,0);
		Point A = new Point(1,0);
		Point B = new Point(1,1);
		Point D = new Point(2,1);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertFalse(t.isIsosceles());
	}
	
	
	@Test 
	void testIsIsosceles6() {
		Point A = new Point(0,0);
		Point B = new Point(1,2);
		Point C = new Point(3,0);
		Point D = new Point(4,-2);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertFalse(t.isIsosceles());
	}
	
	@Test 
	void testIsIsosceles7() {
		Point B = new Point(0,0);
		Point C = new Point(1,2);
		Point A = new Point(3,0);
		Point D = new Point(4,-2);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertFalse(t.isIsosceles());
	}
	
	


}
