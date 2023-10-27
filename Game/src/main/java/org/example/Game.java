package org.example;

import java.util.Random;
public class Game {
    private int remainingDistance;
    private int gridSize;
    // Creating a character, 2D array
    private int[][] grid;
    private int treasureLocX;
    private int treasureLocY;
    private int playerLocX;
    private int playerLocY;
    private int monsterLocX;
    private int monsterLocY;
    private int step;
    private Monster[] monsters;

    public Game(int gridSize, int numMonsters) {
        this.gridSize = gridSize;
        this.grid = new int[gridSize][gridSize];
        this.monsters = new Monster[numMonsters];
        this.step = 0;
    }


    public void createGrid() {
        //Creating the grid with the size specified by user
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                // I will fill the whole grid with zeros
                grid[i][j] = 0;
            }
        }
        //Placing the player somewhere
        playerLocX = randomLoc();
        playerLocY = randomLoc();
        grid[playerLocX][playerLocY] = 1;

        //Placing the treasure somewhere
        treasureLocX = randomLoc();
        treasureLocY = randomLoc();
        grid[treasureLocX][treasureLocY] = 2;

        //Placing monsters somewhere, note, I have several monsters
        //A loop is needed to place them all
        for (int i = 0; i < monsters.length; i++) {
            monsterLocX = randomLoc();
            monsterLocY = randomLoc();
            int monsterType = (i % 2 == 0) ? 3 : 4; //create monster type 1 or 2
            monsters[i] = new Monster(monsterType, monsterLocX, monsterLocY);
            this.grid[monsterLocX][monsterLocY] = monsterType;
        }
    }

    public void playerSteps (int x, int y) {
        int stepX = playerLocX + x;
        int stepY = playerLocY + y;

        if (withinBoundaries(stepX, stepY)) {
            grid[playerLocX][playerLocY] = 0;
            playerLocX = stepX;
            playerLocY = stepY;
            grid[playerLocX][playerLocY] = 1;
            step++;

            if (playerLocX == treasureLocX && playerLocY == treasureLocY) {
                System.out.println("Treasure found!");
                System.exit(0);
            }

            remainingDistance = howManyLeft(stepX, stepY);
            System.out.println();
            System.out.println("Steps left till treasure is found: " + remainingDistance);

            for (Monster monster : monsters) {
                if (playerLocX == monster.getX() && playerLocY == monster.getY()) {
                    System.out.println("Monster: type - " + monster.getMonsterType() + "!!!");
                    System.out.println("Game over...");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Out of boundaries, retry.");
        }
    }


    private int howManyLeft(int stepX, int stepY) {
        int diffX = Math.abs(playerLocX - treasureLocX);
        int diffY = Math.abs(playerLocY - treasureLocY);
        return diffX + diffY;
    }



    public void showBoard() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                if (i == playerLocX && j == playerLocY) {
                    System.out.print("P ");
                } else if (grid[i][j] == 2) {
                    System.out.print("  ");
                } else if (grid[i][j] == 3) {
                    System.out.print("M");
                } else if (grid[i][j] == 4) {
                    System.out.print("Z");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
        }
    }



    //Randomising locations
    public int randomLoc(){
        Random randomise = new Random();
        return randomise.nextInt(gridSize); // Restrict the "random" range by putting gridSize
    }

    public boolean withinBoundaries (int x, int y){
        if ( x >= 0 && x < gridSize && y >= 0 && y < gridSize){
            return true;
        }
        return false;
    }

   
    public int getGridSize() {
        return gridSize;
    }

    public int getRemainingDistance() {
        return remainingDistance;
    }

    public void setRemainingDistance(int remainingDistance) {
        this.remainingDistance = remainingDistance;
    }

    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public int getTreasureLocX() {
        return treasureLocX;
    }

    public void setTreasureLocX(int treasureLocX) {
        this.treasureLocX = treasureLocX;
    }

    public int getTreasureLocY() {
        return treasureLocY;
    }

    public void setTreasureLocY(int treasureLocY) {
        this.treasureLocY = treasureLocY;
    }

    public int getPlayerLocX() {
        return playerLocX;
    }

    public void setPlayerLocX(int playerLocX) {
        this.playerLocX = playerLocX;
    }

    public int getPlayerLocY() {
        return playerLocY;
    }

    public void setPlayerLocY(int playerLocY) {
        this.playerLocY = playerLocY;
    }

    public int getMonsterLocX() {
        return monsterLocX;
    }

    public void setMonsterLocX(int monsterLocX) {
        this.monsterLocX = monsterLocX;
    }

    public int getMonsterLocY() {
        return monsterLocY;
    }

    public void setMonsterLocY(int monsterLocY) {
        this.monsterLocY = monsterLocY;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public void setMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }
}



class Monster {
    //I will assume to have 2 monster types
    private static int monsterTypes = 2;
    private int monsterType;
    private int x;
    private int y;

    public Monster(int type, int x, int y){
        this.monsterType = randomType();
        this.x = x;
        this.y = y;
    }

    public int randomType(){
        Random rand = new Random();
        return rand.nextInt(monsterTypes) + 1;
    }
    public int getMonsterType() {
        return monsterType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getMonsterTypes() {
        return monsterTypes;
    }

    public static void setMonsterTypes(int monsterTypes) {
        Monster.monsterTypes = monsterTypes;
    }

    public void setMonsterType(int monsterType) {
        this.monsterType = monsterType;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}





