package calculator;

import model.DiceRolls;

public class ManyOfAKindScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int rollOccurrences;

    public ManyOfAKindScoreCalculator(DiceRolls diceRolls, int rollOccurrences) {
        super(diceRolls);
        this.rollOccurrences = rollOccurrences;
    }
    @Override
    public int computeScore() {
        return dice.findRollWithOccurrences(rollOccurrences)
            .map(dieRoll -> dieRoll.toNumber() * rollOccurrences)
            .orElse(0);
    }
}
