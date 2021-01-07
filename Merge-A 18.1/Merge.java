import java.util.*;
/**
 *  A class to study merging.
 *
 *  @author Jason Quesenberry and Nancy Quesenberry
 *  @created January 16, 2006
 */

public class Merge{
  public void merge (ArrayList <Integer> a, ArrayList <Integer> b, ArrayList <Integer> c){
     int indexA = 0;
     int indexB = 0; 
     boolean aDone = false;
     boolean bDone = false;
     while(!aDone && !bDone){
         if(indexA >= a.size()){
            aDone = true;
        }
        if(indexB >= b.size()){
            bDone = true;
        }
        if(!aDone && !bDone){
            if(a.get(indexA) > b.get(indexB)){
                c.add(a.get(indexA));
                indexA++;
            }
            else{
                c.add(b.get(indexB));
                indexB++;
            }
        }
    }
    if(aDone){
        for(int x = indexB; x < a.size(); x++){
            c.add(b.get(x));
        }
    }
    else{
        for(int x = indexA; x < a.size(); x++){
            c.add(a.get(x));
        }
    }
  }

  

  /**
   *  Initializes and returns temp with random Integers in the range
   *  1 to largestInt
   *
   * @return  an ArrayList of size specified by the user filled
   *          with random numbers
   */
  public ArrayList <Integer> fillArray(){
    Scanner console = new Scanner(System.in);

    System.out.println();
    System.out.print("How many numbers do you wish to generate? ");
    int numInts = console.nextInt();

    ArrayList <Integer> temp = new ArrayList <Integer> ();

    System.out.print("Largest Integer to generate? ");
    int largestInt = console.nextInt();

    Random randGen = new Random();

    for (int loop = 0; loop < numInts; loop++){
      temp.add(randGen.nextInt(largestInt) + 1);
    }

    return temp;
  }

  /**
   *  Prints out the contents of the array in tabular form, 20 columns
   */
  public void screenOutput(ArrayList <Integer> temp){
    for (int loop = 0; loop < temp.size(); loop++){
      if (loop % 15 == 0){
        System.out.println();
      }
      System.out.printf("%5d",temp.get(loop));
    }
    System.out.println();
  }

}

