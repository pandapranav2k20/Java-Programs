
//Made by Pranav Veerubhotla
public class PiggyBank
{
    private int myPennies;
    private int myNickels;
    private int myDimes;
    private int myQuarters;
   //Default constructor
    public PiggyBank()
    {
        myPennies = 0;
        myNickels = 0;
        myDimes = 0;
        myQuarters = 0;
    }
    

    //deposit
    public void deposit(int myPennies, int myNickels, int myDimes, int myQuarters)
    {
        myPennies += myPennies;
        myNickels += myNickels;
        myDimes += myDimes;
        myQuarters += myQuarters;
    }
    
    //calculate
    public double calculate()
    {
       return (myPennies * 0.01) + (myNickels * 0.05) + (myDimes * 0.1) + (myQuarters * 0.25);
    }
    
    //Getters
    public int getPennies()
    {
        return myPennies;
    }
    
    public int getNickels()
    {
        return myNickels;
    }
    
    public int getDimes()
    {
        return myDimes;
    }
    
    public int getQuarters()
    {
        return myQuarters;
    }
    
    
    
    
    
    
    
    
}
