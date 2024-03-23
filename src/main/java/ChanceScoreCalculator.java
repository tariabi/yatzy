public class ChanceScoreCalculator extends AbstractYatzyScoreCalculator {

    public ChanceScoreCalculator(DiceRolls diceRolls) {
        super(diceRolls);
    }

    @Override
    public int computeScore() {
        int total = 0;
        for (DieRoll die : dice.getRolls()) {
            total += die.toNumber();
        }
        return total;
    }
}
