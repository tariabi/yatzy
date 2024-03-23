public class ManyOfAKindScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int searchedValue;

    public ManyOfAKindScoreCalculator(DiceRolls diceRolls, int searchedValue) {
        super(diceRolls);
        this.searchedValue = searchedValue;
    }

    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(dice);
        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] >= searchedValue)
                return (i + 1) * searchedValue;
        return 0;
    }
}
