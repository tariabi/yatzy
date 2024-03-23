public class CountScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int countedValue;

    public CountScoreCalculator(int[] dices, int countedValue) {
        super(dices);
        this.countedValue = countedValue;
    }

    @Override
    public int computeScore() {
        return new ScoreUtils().countNumber(dice, countedValue);
    }
}
