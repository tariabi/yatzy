public class ManyOfAKindScoreCalculator implements IYatzyScoreCalculator {

    private final int[] dices;

    private final int searchedValue;

    public ManyOfAKindScoreCalculator(int[] dices, int searchedValue) {
        this.dices = dices;
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
