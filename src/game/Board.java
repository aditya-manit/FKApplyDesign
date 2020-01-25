package game;

import java.util.Random;

public class Board {
	public static char[][] board = new char[3][3]; 
	private int r1=0;
	private int r2=0;
	private int r3=0;
	private int c1=0;
	private int c2=0;
	private int c3=0;
	private int d1=0;
	private int d2=0;

	public void clearBoard() {
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]='#';
			}
		}
	}
	
	public void setBoard(int row,int col,char symbol)
	{
		if(board[row][col]!='#')
		{
			System.out.println("Its filled!! Choose another cell !!");
			return;
		}
		if(row<0 || row>=3 || col<0 || col>=3)
		{
			System.out.println("Its out of bounds!! Please Choose a Proper Cell");
			return;
		}
		board[row][col]=symbol;
		if(row==0) {r1++;}
		if(row==1) {r2++;}
		if(row==2) {r3++;}
		if(col==0) {c1++;}
		if(col==1) {c2++;}
		if(col==2) {c3++;}
		if(row==col) {d1++;}
		if(row==3-col-1) {d2++;}
		
		printBoard();
		isWinner(symbol);
	}
	
	public void isWinner(char symbol)
	{
		if(r1==3 || r2==3 || r3==3 || c1==3 || c2==3 ||c3==3 || d1==3 || d2==3)
		{
			System.out.println(symbol + " is the WINNER!!");
		}
	}
	
	public void play()
	{
		Random rand = new Random();
		
		int row=rand.nextInt(3);
		int col=rand.nextInt(3);
		
		if(board[row][col]!='#')
		{
			play();
		}
		else
		{
			board[row][col]='M';
		}
		printBoard();
		
	}
	
	
	
	
	public void printBoard() {

	    System.out.println("-------------");
	    for (int i = 0; i < 3; i++) {
	        System.out.print("| ");
	        for (int j = 0; j < 3; j++) {

	            System.out.print(board[i][j] + " | ");

	        }
	        System.out.println();

	    }
	    System.out.println("-------------");

	}
}
