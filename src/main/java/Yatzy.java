public class Yatzy {

    private final int[] dices;

    public Yatzy(int dice1, int dice2, int dice3, int dice4, int dice5) {
        dices = new int[5];
        dices[0] = dice1;
        dices[1] = dice2;
        dices[2] = dice3;
        dices[3] = dice4;
        dices[4] = dice5;
    }

    public int chance() {
        var scoreCalculator = new ChanceScoreCalculator(dices);
        return scoreCalculator.computeScore();
    }

    public int yatzy() {
        var scoreCalculator = new YatzyScoreCalculator(dices);
        return scoreCalculator.computeScore();
    }

    public int ones() {
        var scoreCalculator = new CountScoreCalculator(dices, 1);
        return scoreCalculator.computeScore();
    }

    public int twos() {
        var scoreCalculator = new CountScoreCalculator(dices, 2);
        return scoreCalculator.computeScore();
    }

    public int threes() {
        var scoreCalculator = new CountScoreCalculator(dices, 3);
        return scoreCalculator.computeScore();
    }

    public int scorePair() {
        var scoreCalculator = new PairScoreCalculator(dices);
        return scoreCalculator.computeScore();
    }

    public int twoPair() {
        var scoreCalculator = new TwoPairsScoreCalculator(dices);
        return scoreCalculator.computeScore();
    }

    public int fourOfAKind() {
        var scoreCalculator = new ManyOfAKindScoreCalculator(dices, 4);
        return scoreCalculator.computeScore();
    }

    public int threeOfAKind() {
        var scoreCalculator = new ManyOfAKindScoreCalculator(dices, 3);
        return scoreCalculator.computeScore();
    }

    public int smallStraight() {
        var scoreCalculator = new SmallStraightScoreCalculator(dices);
        return scoreCalculator.computeScore();
    }

    public int largeStraight() {
        var scoreCalculator = new LargeStraightScoreCalculator(dices);
        return scoreCalculator.computeScore();
    }

    public int fullHouse() {
        var scoreCalculator = new FullHouseScoreCalculator(dices);
        return scoreCalculator.computeScore();
    }

    public int fours() {
        var scoreCalculator = new CountScoreCalculator(dices, 4);
        return scoreCalculator.computeScore();
    }

    public int fives() {
        var scoreCalculator = new CountScoreCalculator(dices, 5);
        return scoreCalculator.computeScore();
    }

    public int sixes() {
        var scoreCalculator = new CountScoreCalculator(dices, 6);
        return scoreCalculator.computeScore();
    }
}



