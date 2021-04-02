package Lesson3.home;

import java.util.Random;
import java.util.Scanner;

public class TheGameMyCode {

    public static char[][] map;
    public static int mapSizeY;
    public static int mapSizeX;

    public static char humanDot = 'X';
    public static char aiDot = 'O';
    public static char emptyDot = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void createMap() {
        mapSizeY = 3;
        mapSizeX = 3;
        map = new char[mapSizeY][mapSizeX];

        for(int y = 0; y < mapSizeY; y++) {
            for(int x = 0; x < mapSizeX; x++) {
                map[y][x] = emptyDot;
            }
        }
    }

    public static void printMap() {
        System.out.println("--------");
        for(int y = 0; y < mapSizeY; y++) {
            for(int x = 0; x < mapSizeX; x++) {
                System.out.print( map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    public static void setHumanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты хода");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while(!isValidCell (y, x) || !isEmptyCell(y, x));

        map[y][x] = humanDot;
    }

    public static void setAiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        }while (!isEmptyCell(y, x));

        map[y][x] = aiDot;
    }

    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == emptyDot;
    }

    public static boolean isValidCell(int y, int x) {
        return y >= 0 && y < mapSizeY && x >= 0 && x < mapSizeX;
    }

    public static boolean checkWinner(char currentPlayer) {
        for(int y = 0; y < mapSizeY; y++) {
            if(map[y][0] == currentPlayer && map[y][1] == currentPlayer && map[y][2] == currentPlayer ||
                    map[0][y] == currentPlayer && map[1][y] == currentPlayer && map[2][y] == currentPlayer) return true;
            if(map[0][0] == currentPlayer && map[1][1] == currentPlayer && map[2][2] == currentPlayer ||
                    map[2][0] == currentPlayer && map[1][1] == currentPlayer && map[0][2] == currentPlayer) return true;

        }
        return false;


        // Вариант 1
//        if(map[0][0] == currentPlayer && map[0][1] == currentPlayer && map[0][2] == currentPlayer) return true;
//        if(map[1][0] == currentPlayer && map[1][1] == currentPlayer && map[1][2] == currentPlayer) return true;
//        if(map[2][0] == currentPlayer && map[2][1] == currentPlayer && map[2][2] == currentPlayer) return true;
//
//        if(map[0][0] == currentPlayer && map[1][0] == currentPlayer && map[2][0] == currentPlayer) return true;
//        if(map[0][1] == currentPlayer && map[1][1] == currentPlayer && map[2][1] == currentPlayer) return true;
//        if(map[0][2] == currentPlayer && map[1][2] == currentPlayer && map[2][2] == currentPlayer) return true;
//
//        if(map[0][0] == currentPlayer && map[1][1] == currentPlayer && map[2][2] == currentPlayer) return true;
//        if(map[2][0] == currentPlayer && map[1][1] == currentPlayer && map[0][2] == currentPlayer) return true;
//
//        return false;
    }

    public static boolean isFullMap() {
        for(int y = 0; y < mapSizeY; y++) {
            for(int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == emptyDot) return false;
            }
        }
        return true;
    }


    public static void main(String[] arg) {
        createMap();
        printMap();

        while (true) {

            setHumanTurn();
            printMap();
            if (checkWinner(humanDot)) {
                System.out.println("Human WIN");
                break;
            }

            if (isFullMap()) {
                System.out.println("DRAW");
                break;
            }

            setAiTurn();
            printMap();
            if (checkWinner(humanDot)) {
                System.out.println("Human WIN");
                break;
            }

            if (isFullMap()) {
                System.out.println("DRAW");
                break;
            }
        }
    }
}
