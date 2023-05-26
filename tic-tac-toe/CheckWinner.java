package tictactoe;
//Tell us if any player wins
public class CheckWinner {
	public static boolean winner(char symbol) {
	int i,j;
	//checking rows
	for(i=0;i<Grid.rows;i++)
	{
		for(j=0;j<Grid.columns-2;j++)
		{
			if(Grid.grid[i][j] !='-' && Grid.grid[i][j]==Grid.grid[i][j+1]&& Grid.grid[i][j+1] == Grid.grid[i][j+2])
				return true;
		}
	}
	//checking columns
	for(j=0;j<Grid.columns;j++)
	{
		for(i=0;i<Grid.rows-2;i++)
		{
			if(Grid.grid[i][j] !='-' && Grid.grid[i][j]==Grid.grid[i+1][j]&& Grid.grid[i+1][j] == Grid.grid[i+2][j])
				return true;
		}
	}
	//checking diagonals
	for(i=0;i<Grid.rows-2;i++)
	{
		for(j=0;j<Grid.columns-2;j++)
		{
			if(Grid.grid[i][j] !='-' && Grid.grid[i][j]==Grid.grid[i+1][j+1]&& Grid.grid[i+1][j+1] == Grid.grid[i+2][j+2])
				return true;
		}}
	//Checking cross diagonals
	for(i=0;i<Grid.rows-2;i++)
	{
		for(j=2;j<Grid.columns;j++)
		{
			if(Grid.grid[i][j] !='-' && Grid.grid[i][j]==Grid.grid[i+1][j-1]&& Grid.grid[i+1][j-1] == Grid.grid[i+2][j-2])
				return true;
		}}	
			return false;
	}}
//Rowan Samy Gamal ID:6733
//Youmna Ahmed Ali ID:7161
