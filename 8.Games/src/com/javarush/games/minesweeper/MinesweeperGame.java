package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game
{
    public static void main(String[] args) {
        String s1 = "Lana";
        String s2;
        s2=s1;
        System.out.println(s1 + " " + s2);
        s2 = "Sooqa";
        System.out.println(s1 + " " + s2);
    }

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    @Override
    public void initialize()
    {
        setScreenSize(SIDE,SIDE);
        createGame();
    }

    private void createGame()
    {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                gameField[y][x] = new GameObject(x, y);
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }
}

