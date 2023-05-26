package tictactoe;
import java.util.Scanner;

public class Input{
	static int row,column;
	
//Takes the place of the next move from the user and checks whether it's valid or not	
public static void input() {
	Grid g1 = new Grid();
	 Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the number of row:");
    row = scan.nextInt();
    System.out.println("Enter the number of column:");
     column = scan.nextInt();
     while((row>g1.rows||row<=0)||(column>g1.columns||column<=0))
     {   
    	 System.out.println("Invalid row/column please enter the place again");
         input();
}}
//Checks the place the the user choose is empty
public static void placeCheck() {
	input();
	Grid g1 = new Grid();
    while(g1.grid[row-1][column-1]!='-') {
	   {
		   System.out.println("this place is already taken please insert in an empty place");
	   }
	   input();
	   }
}
}
//Rowan Samy Gamal ID:6733
//Youmna Ahmed Ali ID:7161

