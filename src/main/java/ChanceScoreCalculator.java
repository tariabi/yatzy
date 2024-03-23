public class ChanceScoreCalculator extends AbstractYatzyScoreCalculator {

    public ChanceScoreCalculator(int[] dices) {
        super(dices);
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
