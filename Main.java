package game;

import java.util.Scanner;

public class Main {
	public static boolean tryDropPiece(char[][] board, int col, char player){ 
		boolean result = false;
	       // Check if the column is full
	if (board[0][col] != '□'){
	System.out.println("That column is already full."); return false;
	}
	       // Drop the piece as far as it will go. Find the first empty space, starting from the bottom
	for (int row = board.length-1; row >= 0; row--){ if (board[row][col] == '□'){
	             board[row][col] = player;
	return true; }
	}
	return result; }
	
	public static char switchPlayer(char currentPlayer){ if (currentPlayer == 'X'){
		return 'O'; } else {
		return 'X'; }
}
	public static void showGameBoard(char[][] board){
		System.out.println();
		for (int row = 0; row < board.length; row++){
		System.out.print("|");
		for (int col = 0; col < board[row].length; col++){
		          System.out.print(" " + board[row][col] + " |");
		       }
		       System.out.println();
		     }
		}
	
	public static boolean checkForWin(char[][]board){
		boolean result = false;
		for (int row = 0; row < board.length; row++){
			for (int col = 0; col < board[row].length - 3; col++){
			if (board[row][col] != '□' && board[row][col] == board[row][col+1] && board[row][col] == board[row][col+2] && board[row][col] == board[row][col +3]){
			return true; }
			} }
		
		for (int col = 0; col < board[0].length; col++){ for (int row = 0; row < board.length - 3; row++){
			if (board[row][col] != '□' && board[row][col] == board[row+1][col] && board[row][col] == board[row+2][col] && board[row][col] == board[row+3][col]){
			return true; }
			} }
		
		for (int row = 0; row < board.length - 3; row++){
			for (int col = 0; col < board[row].length - 3; col++){
			if (board[row][col] != '□' && board[row][col] == board[row+1][col +1] && board[row][col] == board[row+2][col+2] && board[row][col] == board[row+3][col+3]){
			return true; }
			} }
		
		for (int row = 0; row < board.length - 3; row++){ for (int col = 3; col < board[row].length; col++){
			if (board[row][col] != '□' && board[row][col] == board[row+1] [col-1] && board[row][col] == board[row+2][col-2] && board[row] [col] == board[row+3][col-3]){
			return true; }
			} }
			return result; }
	
	public static char[][] fillBoard(char[][] board, char myChar){
		for (int row = 0; row < board.length; row++){ java.util.Arrays.fill(board[row], 0, board[row].length, myChar);
		}
		return board; }
	

	public static void main(String[] args){
		
		char[][] board = new char[6][7];
		Scanner input = new Scanner(System.in);
		char player = 'X';
		
		
		board = fillBoard(board, '□');
	//	showGameBoard(board);
		while (true){
			// Show the state of the board showGameBoard(board);
			   // Ask player for move
			showGameBoard(board);
			   System.out.print("Player " + player + ", please enter the column where you'd like to drop your piece: ");
			   int col = input.nextInt();
			if (tryDropPiece(board,col, player)){// Try move if(checkForWin(board)){ // Check for winner
				if(checkForWin(board))
				{
				System.out.println("Player " + player + " wins!"); 
				showGameBoard(board);
				return;
				}
		//	return; // End game
			}
			player = switchPlayer(player); // Switch players }
			}
		
		}
	
}
