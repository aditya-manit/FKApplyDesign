package game;

import java.util.Scanner;

public class Players {
	private String name;
    private String playerMove;
    Board newBoard = new Board();
     
    public Players(){
        name = "";
        playerMove = "";
    } 
     
    public void setName(){
        Scanner inputName = new Scanner(System.in);
         
        System.out.println("Enter your name: ");
        name = inputName.nextLine();
    }
    public String getName(){
        return name;
    }
     

}
