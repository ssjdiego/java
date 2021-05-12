import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int score;
    private int[] rolls =  new int[21];
    private int currentRoll;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        this.score = 0;
        int frame = 0;
        for (int i = 0; i < 10; i++) {
            if (isStrike(frame)) {
                score += 10 + strikeBonus(frame);
                frame++;
            } else if (isSpare(frame)) {
                score += 10 + spareBonus(frame);
                frame += 2;
            } else {
                score += sumOfRolls(frame);
                frame += 2;
            }
        }
        return this.score;
    }

    private int sumOfRolls(int frame) {
        return rolls[frame] + rolls[frame+1];
    }

    private int spareBonus(int frame) {
        return rolls[frame+2];
    }

    private int strikeBonus(int frame) {
        return sumOfRolls(frame+1);
    }

    public String getName() {
        return this.name;
    }

    public void bowls(int pins) {
        rolls[currentRoll++] = pins;
    }

    private boolean isStrike(int frame) {
        return rolls[frame] == 10;
    }

    private boolean isSpare(int frame) {
        return rolls[frame] + rolls[frame + 1] == 10;
    }


}
