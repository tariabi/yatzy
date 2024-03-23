package calculator;

import model.DiceRolls;

public class LargeStraightScoreCalculator extends StraightScoreCalculator {
    private static final int[] STRAIGHT = new int[]{2, 3, 4, 5, 6};
    private static final int WIN_VALUE = 20;
    @Override
    protected int winValue() {
        return WIN_VALUE;
    }
    @Override
    protected int[] straightSequence() {
        return STRAIGHT;
    }
    public LargeStraightScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

}
