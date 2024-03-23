public class YatzyScoreCalculator extends AbstractYatzyScoreCalculator {

    public YatzyScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }
    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(dice.getRolls());
        for (int tally : tallies)
            if (tally == 5)
                return 50;
        return 0;
    }
}
