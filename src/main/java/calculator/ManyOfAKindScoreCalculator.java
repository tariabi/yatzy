package calculator;

import model.DiceRolls;

public class ManyOfAKindScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int searchedValue;

    public ManyOfAKindScoreCalculator(DiceRolls diceRolls, int searchedValue) {
        super(diceRolls);
        this.searchedValue = searchedValue;
    }

    @Override
    public int computeScore() {
        var tallies = dice.buildRollsOccurrenceList();

        for (int i = 0; i < tallies.size(); i++) {
            if (tallies.get(i) >= searchedValue) {
                return (i + 1) * searchedValue;
            }
        }
        return 0;
    }
}
