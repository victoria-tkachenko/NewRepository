package Lesson3.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 04.02.2021
 */

public class TheGame {

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static char human_dot = 'X';
    public static char ai_dot = 'O';
    public static char empty_dot = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random(); //[0 -> 1)

    public static void createMap() {
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = empty_dot;
            }
        }
    }

    public static void printMap() {
        System.out.println("-----------------");
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    public static void humanTurn() {

        int x;
        int y;

        do {
            System.out.println("Enter your coordinates: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x));

        map[y][x] = human_dot;

    }

    public static void aiTurn() {

        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX); //(0-2)
            y = random.nextInt(mapSizeY); //(0-2)
        } while (!isEmptyCell(y, x));

        map[y][x] = ai_dot;

    }

    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == empty_dot;
    }

    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean checkWin(char currentPlayer){
        if (map[0][0] == currentPlayer && map[0][1] == currentPlayer && map[0][2] == currentPlayer) return true;
        if (map[1][0] == currentPlayer && map[1][1] == currentPlayer && map[1][2] == currentPlayer) return true;
        if (map[2][0] == currentPlayer && map[2][1] == currentPlayer && map[2][2] == currentPlayer) return true;

        if (map[0][0] == currentPlayer && map[1][0] == currentPlayer && map[2][0] == currentPlayer) return true;
        if (map[0][1] == currentPlayer && map[1][1] == currentPlayer && map[2][1] == currentPlayer) return true;
        if (map[0][2] == currentPlayer && map[1][2] == currentPlayer && map[2][2] == currentPlayer) return true;

        if (map[0][0] == currentPlayer && map[1][1] == currentPlayer && map[2][2] == currentPlayer) return true;
        if (map[0][2] == currentPlayer && map[1][1] == currentPlayer && map[2][0] == currentPlayer) return true;

        return false;
    }

    public static boolean isFullMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == empty_dot) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        createMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(human_dot)) {
                System.out.println("Human WIN!");
                break;
            }
            if (isFullMap()) {
                System.out.println("DRAW!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(ai_dot)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isFullMap()) {
                System.out.println("DRAW!");
                break;
            }
        }

    }

}

/**
 * Полностью разобраться с кодом, попробовать переписать с нуля;
 * ^ Усовершенствовать метод проверки победы (через циклы);
 * ^ Расширить поле до 5х5 и в качестве условий победы установить серию равной 4.
 * ^^ Проработать базовый искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */
