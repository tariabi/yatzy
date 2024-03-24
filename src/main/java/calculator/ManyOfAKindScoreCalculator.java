package calculator;

import model.DiceRolls;
import model.DieRoll;

import java.util.Map;

public class ManyOfAKindScoreCalculator extends AbstractYatzyScoreCalculator {
    private final int searchedValue;

    public ManyOfAKindScoreCalculator(DiceRolls diceRolls, int searchedValue) {
        super(diceRolls);
        this.searchedValue = searchedValue;
    }
    @Override
    public int computeScore() {
        var map = dice.buildRollsOccurrenceMap();
        int sumOfAKind = 0;
        for(Map.Entry<DieRoll, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= searchedValue) {
                sumOfAKind = searchedValue * entry.getKey().toNumber();
            }
        }
        return sumOfAKind;
    }
}
