
class Driver
{
    public static void main (String[]args)
    {
       Circle circA = new Circle();
       Circle circB = new Circle(0, -80, 400);
       Circle circC = new Circle(100, -100, 20); 
       circA.draw();
       circB.draw();
       circC.draw();
    }
    
}