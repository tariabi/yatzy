public class YatzyScoreCalculator implements IYatzyScoreCalculator {
    private final int[] dices;
    public YatzyScoreCalculator(int[] dices) {
        this.dices = dices;
    }
    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(this.dices);
        for (int tally : tallies)
            if (tally == 5)
                return 50;
        return 0;
    }
}
