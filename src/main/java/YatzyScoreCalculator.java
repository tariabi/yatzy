public class YatzyScoreCalculator extends AbstractYatzyScoreCalculator {

    public YatzyScoreCalculator(int[] dices) {
        super(dices);
    }
    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(dices);
        for (int tally : tallies)
            if (tally == 5)
                return 50;
        return 0;
    }
}
