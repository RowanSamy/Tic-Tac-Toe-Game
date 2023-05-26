package tictactoe;

//x and o grid
public class Grid {
	public static int rows=6;
	public static int columns=7;
    static char[][]grid=new char[rows][columns];

//initializing an empty grid
public static void initialization() {
	    for (int i = 0; i <rows; i++) {
			for (int j = 0; j < columns; j++) {
				grid[i][j]='-';
        }}}

//printing the grid and check if 2 players draw
public static void display() {
		  for (int i = 0; i <rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(grid[i][j] +"  ");
		  }
			System.out.print("\n");
	      }    
		  int end=1;
		   for (int i = 0;i<rows;i++) { 
				for (int j = 0; j < columns; j++) 
			{
				if(grid[i][j]=='-')
					end=0;
			}}
		  if(end==1)
		 {
			  System.out.println("Game draws");
			  System.exit(0);}
		 }
	}
//Rowan Samy Gamal ID:6733
//Youmna Ahmed Ali ID:7161
	  
	