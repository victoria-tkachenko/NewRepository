package Lesson7.online;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2021
 */

public class GameMap extends JPanel {

    public static final int GM_HVH = 0;
    public static final int GM_HVA = 1;

    GameMap() {
        setBackground(Color.BLACK);
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.println("mode = " + gameMode +
                " fieldSizeX = " + fieldSizeX +
                " fieldSizeY = " + fieldSizeY +
                " winLength = " + winLength);
    }


/*
1. Полностью разобраться с кодом (попробовать полностью самостоятельно переписать одно из окон)
2. Составить список вопросов и приложить в виде комментария к домашней работе
 */
}
