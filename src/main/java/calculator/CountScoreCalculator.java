package calculator;

import model.DiceRolls;

public class CountScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int countedValue;

    public CountScoreCalculator(DiceRolls diceRolls, int countedValue) {
        super(diceRolls);
        this.countedValue = countedValue;
    }

    @Override
    public int computeScore() {
        return dice.countNumber(countedValue);
    }
}