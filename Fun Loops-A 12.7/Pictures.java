import gpdraw.*;
public class Pictures
{
   public static void timesTable(int rows, int columns)
   {
       for(int a = 1; a< columns; ++a)
       {
           System.out.printf("%6d", a);
        }
       for(int a = 1; a<rows; ++a)
       {
           System.out.printf("%d", a);
           for(int b = 1; b<columns; ++b)
           {
               System.out.printf("%6d",(a*b));
            }
           
           
        }
       
       
       
    }
   public static void drawStars(int level)
   {
     
       
       
       
       
    }
   public static void drawSunburst(int lev)
   {
       
       SketchPad paper = new SketchPad(500,500);
       DrawingTool pen = new DrawingTool(paper);
       for( lev = 0; lev < 360; ++lev)
       {
           pen.up();
           pen.move(0,0);
           pen.setDirection(0 + lev);
           pen.down();
           pen.forward(200);
           
           
           
        }
       
       
       
       
       
       
    }
    
    
    
    
    
    
}
