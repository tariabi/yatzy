public class CountScoreCalculator implements IYatzyScoreCalculator {

    private final int[] dices;
    private int countedValue;

    public CountScoreCalculator(int[] dices, int countedValue) {
        this.dices = dices;
        this.countedValue = countedValue;
    }

    @Override
    public int computeScore() {
        return new ScoreUtils().countNumber(dices, countedValue);
    }
}
