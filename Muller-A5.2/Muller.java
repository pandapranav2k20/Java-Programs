
import gpdraw.*;
public class Muller
{
    private DrawingTool pen;
    private SketchPad paper;
    public Muller()
    {
        pen = new DrawingTool();
    }
    
    public void drawMuller()
    {
        pen.up();
        pen.turnRight(90);
        pen.down();
        pen.forward(50);
        
        pen.turnLeft(45);
        pen.forward(15);
        pen.move(50,0);
        pen.turnRight(-90);
        pen.forward(15);
        
        pen.up();
        pen.move(0,0);
        pen.down();
        pen.turnLeft(45);
        pen.forward(15);
        
        pen.up();
        pen.move(0,0);
        pen.down();
        pen.turnRight(270);
        pen.forward(15);
        
    }
}
