import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
public class EraseObject implements Eraser
{
    private Scanner in;
    private File points;
    private boolean[][] grid;
    public EraseObject()
    {
        points = new File("digital.txt");
        grid = new boolean[20][20];
        
        try{
            in = new Scanner(points);
        }
        catch(Exception x){
            System.out.println("Done! No more left");
        }
        
        
    }

    //Scans the image
    public void getData()
    {
        int size = in.nextInt();
        for(int a = 0; a < size; a++){
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            grid[x][y] = true;
        }
    }
    //Draws the image
    public void printImage()
    {
    }
    //checks the edges of the shape to make sure it fits in the grid
    public boolean edges(int row, int col)
    {
        if(col > 0 && row > 0 && col < 21 && row < 21){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Erases the Image
    public void erase(int row, int col)
    {
        if(edges(row, col) && grid[row][col] == true){
            grid[row][col] = false;
        }
        if(edges(row, col) && grid[row][col-1] == true){
            erase(row, col-1);
        }
        if(edges(row, col) && grid[row][col+1] == true){
            erase(row, col+1);
        }
        if(edges(row, col) && grid[row-1][col] == true){
            erase(row-1, col);
        }
        if(edges(row, col) && grid[row+1][col] == true){
            erase(row+1, col);
        }
    }
}
