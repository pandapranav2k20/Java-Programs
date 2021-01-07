//made by Pranav Veerubhotla
 import java.util.Scanner;
public class GroceryList
{
    private double item1, item2, item3, item4, item5;
    private  Scanner in = new Scanner(System.in);
    
    public void enterList()
    {
        System.out.print("Please enter the value of item1: ");
        item1 = in.nextDouble();
        System.out.print("Please enter the value of item2: ");
        item2 = in.nextDouble();
        System.out.print("Please enter the value of item3: ");
        item3 = in.nextDouble();
        System.out.print("Please enter the value of item4: ");
        item4 = in.nextDouble();
        System.out.print("Please enter the value of item5: ");
        item5 = in.nextDouble();
        //the gap 
        System.out.println();
        System.out.println();
        //display
        System.out.printf("%-10s %-10s %-10s","Item","Price","Total");
        System.out.println();
        System.out.printf("%-10s %-10.2f %-10.2f","#1",item1,item1);
        System.out.println();
        System.out.printf("%-10s %-10.2f %-10.2f","#2",item2,item1 + item2);
        System.out.println();
        System.out.printf("%-10s %-10.2f %-10.2f","#3",item3,item1 + item2 + item3);
        System.out.println();
        System.out.printf("%-10s %-10.2f %-10.2f","#4",item4,item1 + item2 + item3 + item4);
        System.out.println();
        System.out.printf("%-10s %-10.2f %-10.2f","#5",item5,item1 + item2 + item3 + item4 + item5);
    }
    
    
}
