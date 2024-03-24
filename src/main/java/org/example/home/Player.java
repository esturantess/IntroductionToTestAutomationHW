package org.example.home;

/**
 * Класс для описания игрока
 */
public class Player {
    //имя игрока
    private String name;
    //стратегия игрока, если true игрок меняет дверь
    private boolean risk;

    private String winMessage;
    private String loseMessage;

    public Player(String name, boolean risk) {
        this.name = name;
        this.risk = risk;
    }

    public Player(String name, boolean risk, String winMessage, String loseMessage) {
        this.name = name;
        this.risk = risk;
        this.winMessage = winMessage;
        this.loseMessage = loseMessage;
    }

    public String getName() {
        return name;
    }

    public boolean getRisk() {
        return risk;
    }

    public String getWinMessage() {
        return winMessage;
    }

    public String getLoseMessage() {
        return loseMessage;
    }
}
