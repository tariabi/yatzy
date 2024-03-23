public abstract class AbstractYatzyScoreCalculator implements IYatzyScoreCalculator {

    protected final DiceRolls dice;
    protected AbstractYatzyScoreCalculator(DiceRolls dice) {
        this.dice = dice;
    }
}
