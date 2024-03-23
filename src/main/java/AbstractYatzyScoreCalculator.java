public abstract class AbstractYatzyScoreCalculator implements IYatzyScoreCalculator {

    protected final int[] dices;
    protected AbstractYatzyScoreCalculator(int[] dices) {
        this.dices = dices;
    }
}
