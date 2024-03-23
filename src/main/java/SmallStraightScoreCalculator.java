import java.util.Arrays;

public class SmallStraightScoreCalculator implements IYatzyScoreCalculator {

    private final int[] dices;
    private static final int[] STRAIGHT = new int[]{1, 2, 3, 4, 5};
    private static final int WIN_VALUE = 15;

    public SmallStraightScoreCalculator(int[] dices) {
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
