package calculator;

import model.DiceRolls;

public class LargeStraightScoreCalculator extends StraightScoreCalculator {
    private static final int WIN_VALUE = 20;
    @Override
    protected int winValue() {
        return WIN_VALUE;
    }

    public LargeStraightScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

}
