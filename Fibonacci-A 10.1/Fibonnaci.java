//made by Pranav Veerubhotla
public class Fibonnaci
{
    private int n;
    public Fibonnaci()
    {
       n = 0;
    }
    
    public int fibonnaci(int n)
    {
        if (n==0)
        {
            return 1;
        }
        else if (n==1)
        {
            return n;
        }
        else
        {
            return fibonnaci(n-1) + fibonnaci(n-2);
        }
        
    }
}
