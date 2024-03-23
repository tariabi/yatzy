package calculator;

import model.DiceRolls;

import java.util.Arrays;

public abstract class StraightScoreCalculator extends AbstractYatzyScoreCalculator {

    protected abstract int winValue();
    protected abstract int[] straightSequence();

    protected StraightScoreCalculator(DiceRolls dice) {
        super(dice);
    }

    @Override
    public int computeScore() {
        int[] sorted = dice.getSortedRollValues();
        boolean isStraight = Arrays.equals(sorted, straightSequence());
        if (isStraight)
            return winValue();
        return 0;
    }


}
