package main;

import echec.Game;

public class Main {
    
    public static void main(String[] args) {
        Game g = new Game("Joueur blanc","Joueur noir");
        g.lancer();
    }
    
}