// Made by Pranav Veerubhotla
public class RegularPolygon
{
    private int myNumSides;
    private double mySideLength;
    private double myR;
    private double myr;
    
    // constructors
    public RegularPolygon()
    {
        myNumSides = 3;
        mySideLength = 10;
        myR = 0;
        myr = 0;
    }
    
    public RegularPolygon(int numSides, double sideLength)
    {
        myNumSides = numSides;
        mySideLength = sideLength;
    }
    
    // private methods
    private void calcr()
    {
        double r = 0.5 * mySideLength * 1/Math.tan((Math.PI/myNumSides));
        myr = r;
        
    }

    private void calcR()
    {
        double R = 0.5 * mySideLength * 1/Math.sin((Math.PI/myNumSides));
        myR =R;
        
    }
    
    // puublic methods
    public double vertexAngle()
    {
        double q = ((myNumSides - 2)/myNumSides) * 180;
        return q;
    }
    
    public double Perimeter()
    {
        return myNumSides * mySideLength;
    }
    
    public double getNumside()
    {
        return myNumSides;
    }
    
    public double getSideLength()
    {
        return mySideLength;
    }
    
    public double getR()
    {
        return myR;
    }

    public double getr()
    {
        return myr;
    }
    
    public double Area()
    {
        return (0.5 * myNumSides * myR * myR) * Math.sin(((2 * Math.PI)/myNumSides));
    }
}

