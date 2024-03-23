public class ManyOfAKindScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int searchedValue;

    public ManyOfAKindScoreCalculator(int[] dices, int searchedValue) {
        super(dices);
        this.searchedValue = searchedValue;
    }

    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(dices);
        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] >= searchedValue)
                return (i + 1) * searchedValue;
        return 0;
    }
}
