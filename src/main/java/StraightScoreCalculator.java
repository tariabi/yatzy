public class StraightScoreCalculator implements IYatzyScoreCalculator {

    private final int[] dices;
    private final int fallbackValue;

    public StraightScoreCalculator(int[] dices, int fallbackValue) {
        this.dices = dices;
        this.fallbackValue = fallbackValue;
    }

    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(dices);
        for (int i = 0; i < tallies.length-1; i++) {
            if (tallies[i] != 1)
                return 0;
        }
        return fallbackValue;
    }
}
