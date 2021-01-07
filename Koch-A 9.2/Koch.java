import gpdraw.*;
public class Koch
{
    private static DrawingTool pen = new DrawingTool(new SketchPad(500,500));
    public static void figure(int level, double pixels)
    {
       if(level<1)
       {
         pen.down();
         pen.forward(pixels);
       }
       else
       {
         figure(level-1,pixels/3);
         pen.turnLeft(60);
         figure(level-1,pixels/3);
         pen.turnRight(120);
         figure(level-1,pixels/3);
         pen.turnLeft(60);
         figure(level-1,pixels/3);
       }
    } 
}

