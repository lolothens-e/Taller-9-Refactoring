/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.rpmgame;

/**
 *
 * @author Steven Morocho
 */
public class Round {
    private static final int DRAW = 0;
    private static final int PLAYER1_WIN = 1;
    private static final int PLAYER2_WIN = 2;
    private String player1Choice;
    private String player2Choice;

    public Round(String p1Choice, String p2Choice) {
        this.player1Choice = p1Choice;
        this.player2Choice = p2Choice;
    }

    public int determineWinner() {
        final boolean equalChoices=player1Choice.equals(player2Choice);
        final boolean player1WinsWithRock=player1Choice.equals("ROCK") && player2Choice.equals("SCISSORS");
        final boolean player1WinWithPaper=player1Choice.equals("PAPER") && player2Choice.equals("ROCK");
        final boolean player1WinWithScissors=player1Choice.equals("SCISSORS") && player2Choice.equals("PAPER");
        if (equalChoices) 
            return DRAW;
        if (player1WinsWithRock || player1WinWithPaper || player1WinWithScissors) 
            return PLAYER1_WIN;   
        return PLAYER2_WIN;
    }

    @Override
    public String toString() {
        return "Player 1: " + player1Choice + " | Player 2: " + player2Choice;
    }
}
