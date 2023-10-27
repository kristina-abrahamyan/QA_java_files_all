package org.example;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many monsters do you want?");
        int numMonsters = scan.nextInt();
        scan.nextLine();

        System.out.println("What grid size do you want?");
        int gridSize = scan.nextInt();
        scan.nextLine();

        Game newGame = new Game(gridSize, numMonsters);
        newGame.createGrid();

        while (true) {
            newGame.showBoard();
            System.out.print("Pick a move: up (w), down (s), left (a), right (d).\nTo quit, press 'q'.\n");
            char stepChosen = scan.next().charAt(0);

            if (stepChosen == 'q') {
                System.out.println("Game ended.");
                System.exit(0);
            }

            int x = 0, y = 0;

            switch (stepChosen) {
                case 'w':
                    x = -1;
                    break;
                case 's':
                    x = 1;
                    break;
                case 'a':
                    y = -1;
                    break;
                case 'd':
                    y = 1;
                    break;
            }

            newGame.playerSteps(x, y);
        }

    }

}
