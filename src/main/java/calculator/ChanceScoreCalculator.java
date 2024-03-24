package calculator;

import model.DiceRolls;
import model.DieRoll;

public class ChanceScoreCalculator extends AbstractYatzyScoreCalculator {

    public ChanceScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        return dice.sumRolls();
    }
}
