package calculator;

import model.DiceRolls;

public class YatzyScoreCalculator extends AbstractYatzyScoreCalculator {

    public YatzyScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }
    @Override
    public int computeScore() {
        var map = dice.buildRollsOccurrenceMap();
        if (map.containsValue(dice.rolls().length))
            return 50;
        return 0;
    }
}
