/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.rpmgame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Morocho
 */
public class Game {
    private static final int ROUNDS_TO_WIN = 3;
    private Player player1;
    private Player player2;
    private List<Round> rounds;
    private int draws;
    
    public Game() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.rounds = new ArrayList<>();
        this.draws = 0;
    }
    
    public void playRound() {
        String p1Choice = player1.makeChoice();
        String p2Choice = player2.makeChoice();
        Round round = new Round(p1Choice, p2Choice);
        rounds.add(round);
        displayRoundChoices(round);
        updateGameResults(round.determineWinner());
    }
    
    private void displayRoundChoices(Round round) {
        System.out.println("Round " + rounds.size() + ": " + round);
    }
    
    private void updateGameResults(int winner) {
        if (winner == 1) {
            player1.addWin();
            System.out.println("Player 1 wins this round!");
        } else if (winner == 2) {
            player2.addWin();
            System.out.println("Player 2 wins this round!");
        } else {
            draws++;
            System.out.println("It's a draw!");
        }
    }
    
    public boolean isGameOver() {
        final boolean player1HasWon=player1.getWins() >= ROUNDS_TO_WIN;
        final boolean player2HasWon=player2.getWins() >= ROUNDS_TO_WIN;
        return  player1HasWon||player2HasWon ;
    }
    
    public void printResults() {
        System.out.println("Game Over!");
        System.out.println("Player 1 Wins: " + player1.getWins());
        System.out.println("Player 2 Wins: " + player2.getWins());
        System.out.println("Total Draws: " + draws);
        displayChampion();
    }

    private void displayChampion() {
        final boolean player1HasMoreWins=player1.getWins() > player2.getWins();
        final boolean player2HasMoreWins=player2.getWins() > player1.getWins();
        if (player1HasMoreWins) {
            System.out.println("Player 1 is the champion!");
        } else if (player2HasMoreWins) {
            System.out.println("Player 2 is the champion!");
        } else {
            System.out.println("It's a tie overall!");
        }
    }
}
