package tictactoe;

public class Test{
//where execution starts to run the program and contains all methods used
	 public static void main(String[] args) {
			Grid.initialization();
			Grid.display();
			while(true)
			{
		     Modify.access("player one");
		     Grid.display();
		     Modify.access("player two");
             Grid.display();
		     }
	   }  
}
//Rowan Samy Gamal ID:6733
//Youmna Ahmed Ali ID:7161