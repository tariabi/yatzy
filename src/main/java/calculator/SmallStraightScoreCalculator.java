package calculator;

import model.DiceRolls;

public class SmallStraightScoreCalculator extends StraightScoreCalculator {
    private static final int WIN_VALUE = 15;
    public SmallStraightScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }
    @Override
    protected int winValue() {
        return WIN_VALUE;
    }
}
