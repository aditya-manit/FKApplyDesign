package game;

public class Main {

	public static void main(String[] args) {
		Board newBoard = new Board();
		newBoard.clearBoard();
		newBoard.printBoard();
		System.out.println("Board is created!!");
		Players X= new Players();
		Players O= new Players();
		X.newBoard.setBoard(1, 0, 'X');
		O.newBoard.setBoard(2, 0, 'O');
		//X.newBoard.setBoard(1, 1, 'X');
		//X.newBoard.setBoard(2, 0, 'X');
		
		Machine M = new Machine();
		M.newBoard.play();
		
	}

}
