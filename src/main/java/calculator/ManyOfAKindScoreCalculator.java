package calculator;

import model.DiceRolls;
import model.DieRoll;

public class ManyOfAKindScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int frequencyOfKind;

    public ManyOfAKindScoreCalculator(DiceRolls diceRolls, int frequencyOfKind) {
        super(diceRolls);
        this.frequencyOfKind = frequencyOfKind;
    }
    @Override
    public int computeScore() {
        var sum = dice.rollsHavingFrequencyHigherOrEqualTo(frequencyOfKind)
            .stream().mapToInt(DieRoll::toNumber).sum();
        return sum * frequencyOfKind;
    }
}
