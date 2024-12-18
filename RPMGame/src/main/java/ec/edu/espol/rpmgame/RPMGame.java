/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.rpmgame;

/**
 *
 * @author Steven Morocho
 */
public class RPMGame {

    public static void main(String[] args) {
        Game game=new Game();
        System.out.println("Starting Rock, Paper, Scissors Game!\n");
        do {
            game.playRound();
        } while (!game.isGameOver());
        game.printResults();
    }
}
