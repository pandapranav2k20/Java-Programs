
import gpdraw.*;
public class Circle
{
    private double myX;
    private double myY;
    private double myRadius;
    private DrawingTool pen;
    private SketchPad paper;
    
    public Circle()
    {
       myX = 0;
       myY = 0;
       myRadius = 0;
       pen = new DrawingTool();
       paper = new SketchPad(500,500); 
    }

    
    public Circle(double x, double y, double radius)
    {
      myX = x;
      myY = y;
      myRadius = radius;
      pen = new DrawingTool();
      paper =  new SketchPad(500,500);
    }
    
    public double getCircumference(double circumference)
    {
        circumference = 2 * 3.14 * myRadius;
        return circumference;
    }
    
    public double getArea(double area)
    {
        area = 3.14 * (myRadius * myRadius);
        return area;
    }
    
    public void draw()
    {
        pen.up();
        pen.move(myX, myY);
        pen.down();
        pen.drawCircle(myRadius);
    }
}   
    
