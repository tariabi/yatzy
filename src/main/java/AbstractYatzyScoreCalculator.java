public abstract class AbstractYatzyScoreCalculator implements IYatzyScoreCalculator {

    protected final int[] dice;
    protected AbstractYatzyScoreCalculator(int[] dice) {
        this.dice = dice;
    }
}
