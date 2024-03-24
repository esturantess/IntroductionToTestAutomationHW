package org.example.home;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main класс для запуска Монти Холла в цикле
 */
public class PlayGame {

    private static List<Door> getDoors() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors);
        return doors;
    }

    public static void main(String[] args) {

        Player gamer = new Player("Загадочный Игрок", true, "Ну вот, опять машина... ", "Ура! Я выиграл козу!");
        int statisticWin = 0;
        int step;

        for (step = 0; step < 100; step++) {
            Game game = new Game(gamer, getDoors());

            if (game.round(0).isPrize()) {
                System.out.println(gamer.getName() + ": " + gamer.getWinMessage());
                statisticWin++;
            }
            else System.out.println(gamer.getName() + ": " + gamer.getLoseMessage());
        }
        System.out.println();
        System.out.println("Из " + step + " игр игрок выиграл " + statisticWin + "! Вот это парадокс!");

        Game game = new Game(gamer, getDoors());
    }

}
