package org.example.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GameTest extends AbstractTestInitDoors {

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void playerRiskAndWinTest(int door) {
        Player player = new Player("Корнелиус", true);
        Game game = new Game(player, doors);
        Assertions.assertTrue(game.round(door).isPrize());
    }

    @Test
    void playerRiskAndLoseTest() {
        Player player = new Player("Корнелиус", true);
        Game game = new Game(player, doors);
        Assertions.assertFalse(game.round(0).isPrize());
    }

    @Test
    void playerDoesNotRiskAndWinTest() {
        Player player = new Player("Корнелиус", false);
        Game game = new Game(player, doors);
        Assertions.assertTrue(game.round(0).isPrize());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void playerDoesNotRiskAndLoseTest(int door) {
        Player player = new Player("Корнелиус", false);
        Game game = new Game(player, doors);
        Assertions.assertFalse(game.round(door).isPrize());
    }

}
