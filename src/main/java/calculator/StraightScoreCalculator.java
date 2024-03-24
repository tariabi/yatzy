package calculator;

import model.DiceRolls;

import java.util.Arrays;

public abstract class StraightScoreCalculator extends AbstractYatzyScoreCalculator {

    protected abstract int winValue();
    protected StraightScoreCalculator(DiceRolls dice) {
        super(dice);
    }

    @Override
    public int computeScore() {
        if (dice.isSequence() && dice.sumRolls() == winValue())
            return winValue();
        return 0;
    }
}
