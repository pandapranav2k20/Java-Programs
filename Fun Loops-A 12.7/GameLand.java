//made by Pranav Veerubhotla
import java.util.Scanner;
public class GameLand
{
   public String name1;
   public String name2;
   public void startScreen()
   {
       Scanner in = new Scanner(System.in);
       System.out.println("* ---------- * ---------- *");
       System.out.println("WELCOME TO  G A M E L A N D");
       System.out.println("Enter the name of player 1: ");
       name1 = in.next();
       System.out.println("Enter the name of player 2: ");
       name2 = in.next();
       System.out.println("<Good luck " + name1 + " and " + name2 + ">");
   }
    
   public int roll()
   {
       int dice1 = 1 + (int)(Math.random() * 5);
       int dice2 = 1 + (int)(Math.random() * 5);
       System.out.println("You rolled " +dice1+ " on your first die");
       System.out.println("You rolled " +dice2+ " on your second die");
       System.out.println("In total, you rolled " + (dice1+dice2));
       return dice1+dice2;
   }
   
   public int realRoll()
   {
       int theRoll = roll();
       if (theRoll == 2 || theRoll == 12){
           return 0;
        }
       else{
           return roll();
        }
   }
   
   public void turn()
   {
       int squares = 100;
       int a = 1;
       
       int player1DistanceLeft = squares -realRoll();
       int player2DistanceLeft = squares -realRoll();
       while (player1DistanceLeft > 0 && player2DistanceLeft >0){ 
           System.out.println(name1 + " is on square: " + realRoll());
           System.out.println(name2 + " is on square: " + realRoll());
           System.out.println("Both players are at turn" + ++a);
        }
       if (player1DistanceLeft == 0){
           System.out.println("Congratulations " + name1 + ", You have won!");
        }
        else{
            turn();
        }
       if (player2DistanceLeft == 0){
           System.out.println("Congratulations " + name2 + ", You have won!");
        }
        else{
            turn();
        }
      
   }
}
