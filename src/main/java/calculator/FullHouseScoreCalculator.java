package calculator;

import model.DiceRolls;
import model.DieRoll;

import java.util.Arrays;

public class FullHouseScoreCalculator extends AbstractYatzyScoreCalculator {

    public FullHouseScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        var map = dice.buildRollsOccurrenceMap();
        if (map.containsValue(3) && map.containsValue(2))
            return dice.sumRolls();
        return 0;
    }
}
