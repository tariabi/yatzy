package calculator;

import model.DiceRolls;

public class YatzyScoreCalculator extends AbstractYatzyScoreCalculator {

    public YatzyScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }
    @Override
    public int computeScore() {
        var tallies = dice.buildRollsOccurrenceList();
        for (Integer tally : tallies) {
            if (tally == 5)
                return 50;
        }
        return 0;
    }
}
