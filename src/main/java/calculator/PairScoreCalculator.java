package calculator;

import model.DiceRolls;
import model.DieRoll;

import java.util.Comparator;

public class PairScoreCalculator extends AbstractYatzyScoreCalculator {
    public PairScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        var allPairs = dice.rollsHavingFrequencyHigherOrEqualTo(2);
        if (!allPairs.isEmpty()) {
            allPairs.sort(Comparator.comparingInt(DieRoll::toNumber).reversed());
            var highestPair = allPairs.get(0);
            return 2 * highestPair.toNumber();
        }
        return 0;
    }
}
