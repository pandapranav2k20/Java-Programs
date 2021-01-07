import gpdraw.*;

public class Rectangle
{
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private static DrawingTool pen;
    private SketchPad paper;
    
    public Rectangle()
    {
        myX = 0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
        pen = new DrawingTool();
        paper = new SketchPad(500,500);
    }
    
    public Rectangle(double x, double y, double width, double height)
    {
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }
    
    public double getPerimeter(double perimeter)
    {
        perimeter = (myWidth + myHeight + myWidth + myHeight);
        return perimeter;
    }
    
    public double getArea(double area)
    {
        area = myWidth * myHeight;
        return area;
    }
    
    public void draw()
    {
        pen.move(myX, myY);
        pen.turnRight(90);
        pen.forward(myWidth);
        pen.turnRight(-90);
        pen.forward(myHeight);
        pen.up();
        pen.backward(myHeight);
        pen.turnRight(-90);
        pen.backward(myWidth);
        pen.down();
        pen.turnRight(0);
        pen.forward(myHeight);
        pen.up();
        pen.turnRight(90);
        pen.down();
        pen.forward(myWidth);
       
    }
}
    