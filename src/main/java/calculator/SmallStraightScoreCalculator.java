package calculator;

import model.DiceRolls;

import java.util.Arrays;

public class SmallStraightScoreCalculator extends AbstractYatzyScoreCalculator {
    private static final int[] STRAIGHT = new int[]{1, 2, 3, 4, 5};
    private static final int WIN_VALUE = 15;

    public SmallStraightScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        int[] sorted = dice.getSortedRollValues();
        boolean isStraight = Arrays.equals(sorted, STRAIGHT);
        if (isStraight)
           return WIN_VALUE;
        return 0;
    }
}
