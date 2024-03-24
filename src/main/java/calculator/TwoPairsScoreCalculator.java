package calculator;

import model.DiceRolls;
import model.DieRoll;

import java.util.Map;

public class TwoPairsScoreCalculator extends AbstractYatzyScoreCalculator {
    public TwoPairsScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        var map = dice.buildRollsOccurrenceMap();
        int pairRolls = 0;
        int pairs = 0;
        for(Map.Entry<DieRoll, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                pairs++;
                pairRolls += entry.getKey().toNumber();
            }
        }
        if (pairs == 2)
            return 2 * pairRolls;
        return 0;
    }
}
