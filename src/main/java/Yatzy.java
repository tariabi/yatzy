import calculator.*;
import model.DiceRolls;

public class Yatzy {
    private final DiceRolls dice;

    public Yatzy(int... dieRolls) {
        dice = DiceRolls.fromRolls(dieRolls);
    }

    public int chance() {
        var scoreCalculator = new ChanceScoreCalculator(dice);
        return scoreCalculator.computeScore();
    }

    public int yatzy() {
        var scoreCalculator = new YatzyScoreCalculator(dice);
        return scoreCalculator.computeScore();
    }

    public int ones() {
        var scoreCalculator = new CountScoreCalculator(dice, 1);
        return scoreCalculator.computeScore();
    }

    public int twos() {
        var scoreCalculator = new CountScoreCalculator(dice, 2);
        return scoreCalculator.computeScore();
    }

    public int threes() {
        var scoreCalculator = new CountScoreCalculator(dice, 3);
        return scoreCalculator.computeScore();
    }

    public int fours() {
        var scoreCalculator = new CountScoreCalculator(dice, 4);
        return scoreCalculator.computeScore();
    }

    public int fives() {
        var scoreCalculator = new CountScoreCalculator(dice, 5);
        return scoreCalculator.computeScore();
    }

    public int sixes() {
        var scoreCalculator = new CountScoreCalculator(dice, 6);
        return scoreCalculator.computeScore();
    }

    public int scorePair() {
        var scoreCalculator = new PairScoreCalculator(dice);
        return scoreCalculator.computeScore();
    }

    public int twoPair() {
        var scoreCalculator = new TwoPairsScoreCalculator(dice);
        return scoreCalculator.computeScore();
    }

    public int fourOfAKind() {
        var scoreCalculator = new ManyOfAKindScoreCalculator(dice, 4);
        return scoreCalculator.computeScore();
    }

    public int threeOfAKind() {
        var scoreCalculator = new ManyOfAKindScoreCalculator(dice, 3);
        return scoreCalculator.computeScore();
    }

    public int smallStraight() {
        var scoreCalculator = new SmallStraightScoreCalculator(dice);
        return scoreCalculator.computeScore();
    }

    public int largeStraight() {
        var scoreCalculator = new LargeStraightScoreCalculator(dice);
        return scoreCalculator.computeScore();
    }

    public int fullHouse() {
        var scoreCalculator = new FullHouseScoreCalculator(dice);
        return scoreCalculator.computeScore();
    }
}