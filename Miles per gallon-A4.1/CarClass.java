public class CarClass
{
    private int myStartMiles;
    private int myEndMiles;
    private double myGallonsUsed;
    
    public CarClass(int odometerReading)
    {
        myStartMiles = odometerReading;
        myEndMiles = odometerReading;
        myGallonsUsed = 0;
    }
    
    public void fillUp(int odometerReading, double gallons)
    {
        myEndMiles = odometerReading;
        myGallonsUsed +=gallons;
    }
    
    public double calculateMPG()
    {
        return (myEndMiles - myStartMiles)/myGallonsUsed;
    }
    
    public void resetMPG()
    {
        myGallonsUsed = 0;
        myStartMiles = myEndMiles;
    }
}
    