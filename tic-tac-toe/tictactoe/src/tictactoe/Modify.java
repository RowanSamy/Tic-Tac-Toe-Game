package tictactoe;

public class Modify {
//Assigns the symbol of player to the place he inputs
	public static void access(String player)
    {
   Grid g1 = new Grid();
   char symbol='x';
   if (player.equals("player one"))
   	symbol='X';
   else if (player.equals("player two"))
   	symbol='O';
   System.out.println(player+"'s turn (" +  symbol+")");
   Input.placeCheck();
   g1.grid[Input.row-1][Input.column-1]=symbol;
   
   if(CheckWinner.winner(symbol)==true)
   	 {
	   Grid.display();
   	System.out.println(player+" wins");
   	System.exit(0);
   	 }
 	  }
}
//Rowan Samy Gamal ID:6733
//Youmna Ahmed Ali ID:7161