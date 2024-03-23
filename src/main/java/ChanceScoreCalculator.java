public class ChanceScoreCalculator implements IYatzyScoreCalculator {

    private final int[] dices;

    public ChanceScoreCalculator(int[] dices) {
        this.dices = dices;
    }

    @Override
    public int computeScore() {
        int total = 0;
        for (int die : dices) {
            total += die;
        }
        return total;
    }
}
