public class Rectangle {
    Point Ax;
    Point By;
    Point Cy;
    Point Dx;

    public Rectangle(Point Ax, Point By, Point Cy, Point Dx){
        this.Ax = Ax;
        this.By = By;
        this.Cy = Cy;
        this.Dx = Dx;
    }

    public double perimeter(){
        return Ax.distance(By) + By.distance(Cy) + Cy.distance(Dx);
    }

    public double area(){
        return Ax.distance(By) * Ax.distance(Dx);
    }

    public boolean isSquare(){
        return Ax.distance(By) == Ax.distance(Dx);
    }


}
 


