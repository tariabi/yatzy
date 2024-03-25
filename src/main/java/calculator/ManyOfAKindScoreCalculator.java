package calculator;

import model.DiceRolls;
import model.DieRoll;

public class ManyOfAKindScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int rollOccurrences;

    public ManyOfAKindScoreCalculator(DiceRolls diceRolls, int rollOccurrences) {
        super(diceRolls);
        this.rollOccurrences = rollOccurrences;
    }
    @Override
    public int computeScore() {
        var sum = dice.findRollsWithOccurrences(rollOccurrences)
            .stream().mapToInt(DieRoll::toNumber).sum();
        return sum * rollOccurrences;
    }
}
