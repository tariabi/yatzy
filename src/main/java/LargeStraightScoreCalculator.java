import java.util.Arrays;

public class LargeStraightScoreCalculator extends AbstractYatzyScoreCalculator {
    private static final int[] STRAIGHT = new int[]{2, 3, 4, 5, 6};
    private static final int WIN_VALUE = 20;

    public LargeStraightScoreCalculator(DiceRolls diceRolls) {
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
