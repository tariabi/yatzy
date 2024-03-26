package calculator;

import model.DiceRolls;
import model.DieRoll;

public class TwoPairsScoreCalculator extends AbstractYatzyScoreCalculator {
    public TwoPairsScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        var allPairs = dice.rollsHavingFrequencyHigherOrEqualTo(2);
        if (allPairs.size() == 2) {
            return 2 * allPairs.stream().mapToInt(DieRoll::toNumber).sum();
        }
        return 0;
    }
}
