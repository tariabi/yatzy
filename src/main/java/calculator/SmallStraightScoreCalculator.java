package calculator;

import model.DiceRolls;

public class SmallStraightScoreCalculator extends StraightScoreCalculator {
    private static final int[] STRAIGHT = new int[]{1, 2, 3, 4, 5};
    private static final int WIN_VALUE = 15;
    public SmallStraightScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }
    @Override
    protected int winValue() {
        return WIN_VALUE;
    }
    @Override
    protected int[] straightSequence() {
        return STRAIGHT;
    }
}
