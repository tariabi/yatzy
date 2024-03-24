package calculator;

import model.DiceRolls;
import model.DieRoll;

public class ChanceScoreCalculator extends AbstractYatzyScoreCalculator {

    public ChanceScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        int total = 0;
        for (DieRoll die : dice.rolls()) {
            total += die.toNumber();
        }
        return total;
    }
}
