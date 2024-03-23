public class FullHouseScoreCalculator extends AbstractYatzyScoreCalculator {

    public FullHouseScoreCalculator(int[] dices) {
        super(dices);
    }

    @Override
    public int computeScore() {
        var tallies = new ScoreUtils().buildIntArrayFromParametersList(dices);
        boolean _2 = false;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }

        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }
}
