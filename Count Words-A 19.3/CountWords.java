import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Pranav Veerubhotla APCS 4th period
 * March 23 2017
 */
public class CountWords{
    private File text;
    private Scanner in;
    private ArrayList <String> words;
    public void countWords(){
        words = new ArrayList <String> ();
        try{
            text = new File("Lincoln.txt");
            in = new Scanner(text);
            while(in.hasNext()){
                String currentWord = in.next();
                int lastChar = (int)currentWord.charAt(currentWord.length()-1);
                System.out.println(currentWord);
                if(currentWord.equals(" ")){
                    
                }
                if(lastChar == 45){
                    
                }
                if(currentWord.equals("-")){
                    
                }
                
            }
        }
        catch(Exception e){
            System.out.println("No File named: " + "Lincoln.txt" + "could be found");
        }
    }
}