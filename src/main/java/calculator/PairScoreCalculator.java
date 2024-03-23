package calculator;

import model.DiceRolls;

public class PairScoreCalculator extends AbstractYatzyScoreCalculator {
    public PairScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        var tallies = dice.buildRollsOccurrenceList();
        for (int i = 0; i < tallies.size(); i++)
            if (tallies.get(6 - i - 1) >= 2)
                return (6 - i) * 2;
        return 0;
    }
}
