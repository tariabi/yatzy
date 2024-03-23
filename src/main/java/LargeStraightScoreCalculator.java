import java.util.Arrays;

public class LargeStraightScoreCalculator implements IYatzyScoreCalculator {
    private final int[] dices;
    private static final int[] STRAIGHT = new int[]{2, 3, 4, 5, 6};
    private static final int WIN_VALUE = 20;

    public LargeStraightScoreCalculator(int[] dices) {
        this.dices = dices;
    }

    @Override
    public int computeScore() {
        int[] sorted = Arrays.stream(dices).sorted().toArray();
        boolean isStraight = Arrays.equals(sorted, STRAIGHT);
        if (isStraight)
            return WIN_VALUE;
        return 0;
    }
}
