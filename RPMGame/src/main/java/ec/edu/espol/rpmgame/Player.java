/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.rpmgame;

import java.util.Random;

/**
 *
 * @author Steven Morocho
 */
public class Player {
    private static final String[] CHOICES = {"ROCK", "PAPER", "SCISSORS"};
    private int totalWins;

    public String makeChoice() {
        Random random = new Random();
        return CHOICES[random.nextInt(CHOICES.length)];
    }

    public void addWin() {
        totalWins++;
    }

    public int getWins() {
        return totalWins;
    }
}
