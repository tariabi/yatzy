import java.util.Arrays;

public class StraightScoreCalculator implements IYatzyScoreCalculator {

    private final int[] dices;
    private final int fallbackValue;

    private static final int[] SMALL_STRAIGHT = new int[]{1, 2, 3, 4, 5};

    public StraightScoreCalculator(int[] dices, int fallbackValue) {
        this.dices = dices;
        this.fallbackValue = fallbackValue;
    }

    @Override
    public int computeScore() {
        int[] sorted = Arrays.stream(dices).sorted().toArray();
        boolean isSmallStraight = Arrays.equals(sorted, SMALL_STRAIGHT);
        if (!isSmallStraight)
            return 0;
        return fallbackValue;
    }
}
