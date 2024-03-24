package calculator;

import model.DiceRolls;
import model.DieRoll;

import java.util.Map;

public class PairScoreCalculator extends AbstractYatzyScoreCalculator {
    public PairScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        var map = dice.buildRollsOccurrenceMap();
        int pairRoll = 0;
        for(Map.Entry<DieRoll, Integer> entry : map.entrySet()) {
           if (entry.getValue() >= 2 && entry.getKey().toNumber() > pairRoll) {
               pairRoll = entry.getKey().toNumber();
           }
        }
        return 2 * pairRoll;
    }
}
