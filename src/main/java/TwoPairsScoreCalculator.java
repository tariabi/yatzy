public class TwoPairsScoreCalculator implements IYatzyScoreCalculator {

    private final int[] dices;

    public TwoPairsScoreCalculator(int[] dices) {
        this.dices = dices;
    }

    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(dices);
        int n = 0;
        int score = 0;
        for (int i = 0; i < tallies.length; i++)
            if (tallies[6 - i - 1] >= 2) {
                n++;
                score += (6 - i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }
}
