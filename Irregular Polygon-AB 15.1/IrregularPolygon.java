import java.awt.geom.*;
import java.util.ArrayList;
import gpdraw.*;

public class IrregularPolygon{
    private ArrayList<Point2D.Double> points;
    private static DrawingTool pen = new DrawingTool(new SketchPad(500,500));
    public IrregularPolygon(){
        points = new ArrayList<Point2D.Double>();
    }
    public void add(Point2D.Double point){
        points.add(point);
    }
    public void add(double x, double y){
        points.add(new Point2D.Double(x,y));
    }
    public void draw(){
        for(int x = 0; x < points.size(); x++){
            Point2D.Double point = points.get(x);
            pen.move(point.x,point.y);
            pen.down();
        }
    }
    public double perimeter(){
        int size = points.size();
        double perimeter = 0;
        for(int x = 0; x < size; x++){
            Point2D.Double current = points.get(x);
            Point2D.Double next = points.get((x+1)%size);
            double disCurrent = Math.sqrt((current.x - next.x) * (current.x- next.x) + (current.y - next.y) * (current.y - next.y));
            perimeter += disCurrent;
        }
        return perimeter;
    }
    public double area(){
        return 0;
    }
    public void fixOrder(){
        
    }
}