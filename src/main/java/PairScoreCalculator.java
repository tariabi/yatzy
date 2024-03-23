public class PairScoreCalculator extends AbstractYatzyScoreCalculator {
    public PairScoreCalculator(int[] dices) {
        super(dices);
    }

    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(dices);
        for (int i = 0; i < tallies.length; i++)
            if (tallies[6 - i - 1] >= 2)
                return (6 - i) * 2;
        return 0;
    }
}
