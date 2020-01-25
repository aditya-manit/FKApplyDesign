# FKApplyDesign

to create a new player do :
    Players X= new Players();
		Players O= new Players();
 to create a new machine:
    Machine M = new Machine();
    
    to play a players move:
    X.newBoard.setBoard(pass_row_indx, pass_col_indx, 'X');
    O.newBoard.setBoard(pass_row_indx, pass_col_indx, 'O');
    
    machine will randomly play its move:
    M.newBoard.play();
    
    Winning logic is implemmeted in O(1). It automatically show a msg as soon as a player wins.
    
    
    
    
