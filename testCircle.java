import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testCircle {
    @Test
    void testConstructor(){
        Point center = new Point(0.0, 0.0);
        Circle c = new Circle(center, 2.0);
        assertEquals(c.center, center);
        assertEquals(c.radius, 2.0);
    }
    @Test
    void testPerimeter(){
        Point center = new Point(0.0, 0.0);
        Circle c = new Circle(center, 2.0);
        double p = c.perimeter();
        assertEquals(p,12.56636);
    }
    @Test
    void testArea(){
        Point center = new Point(0.0, 0.0);
        Circle c = new Circle(center, 3.0);
        assertEquals(c.area(), 28.27431);
    }

}
