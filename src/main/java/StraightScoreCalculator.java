import java.util.Arrays;

public class StraightScoreCalculator implements IYatzyScoreCalculator {

    private final int[] dices;
    private static final int[] SMALL_STRAIGHT = new int[]{1, 2, 3, 4, 5};
    private static final int WIN_VALUE = 15;

    public StraightScoreCalculator(int[] dices) {
        this.dices = dices;
    }

    @Override
    public int computeScore() {
        int[] sorted = Arrays.stream(dices).sorted().toArray();
        boolean isSmallStraight = Arrays.equals(sorted, SMALL_STRAIGHT);
        if (isSmallStraight)
           return WIN_VALUE;
        return 0;
    }
}
