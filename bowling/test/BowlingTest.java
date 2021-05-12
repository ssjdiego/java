import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {
    @Test
    public void testScore() {
        Player player1 = new Player("X");
        assertEquals("Score is not 0", player1.getScore(), 0);
    }

    @Test
    public void testName() {
        Player player1 = new Player("X");
        assertEquals("Name is incorrect", player1.getName(), "X");
    }
    @Test
    public void testRollUpdatesThePlayersScore() {
        Player player1 = new Player("X");
        player1.bowls(8);
        assertEquals("The score is incorrect", player1.getScore(), 8);
    }
    @Test
    public void testPlayerBowlsASpare() {
        Player player = new Player("X");
        player.bowls(8);
        player.bowls(2);
        player.bowls(7);
        player.bowls(2);
        assertEquals("The frames are not empty", player.getScore(), 26);
    }

    @Test
    public void testPlayerBowlsAStrikeFirstAndNextASpare() {
        Player player = new Player("X");
        player.bowls(10);
        player.bowls(5);
        player.bowls(5);
        player.bowls(2);
        player.bowls(1);
        assertEquals("The frames are not empty", player.getScore(), 35);
    }

}



/*
Test the game
* test score
* test name
* test when roll it updates score
* test frames get updated
* test spares
* test strikes



*/