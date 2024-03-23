package calculator;

import model.DiceRolls;

public class YatzyScoreCalculator extends AbstractYatzyScoreCalculator {

    public YatzyScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }
    @Override
    public int computeScore() {
        var tallies = dice.buildRollsOccurrenceList();
        if (tallies.contains(Integer.valueOf(5)))
            return 50;
        return 0;
    }
}
