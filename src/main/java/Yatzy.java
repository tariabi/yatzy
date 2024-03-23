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
        var scoreCalculator = new ChanceScoreCalculator(this.dices);
        return scoreCalculator.computeScore();
    }

    public int yatzy() {
        var tallies = buildIntArrayFromParametersList();
        for (int tally : tallies)
            if (tally == 5)
                return 50;
        return 0;
    }

    private int countNumber(int countedValue) {
        int sum = 0;
        if (dices[0] == countedValue) sum += countedValue;
        if (dices[1] == countedValue) sum += countedValue;
        if (dices[2] == countedValue) sum += countedValue;
        if (dices[3] == countedValue) sum += countedValue;
        if (dices[4] == countedValue) sum += countedValue;
        return sum;
    }

    public int ones() {
        return countNumber(1);
    }

    public int twos() {
        return countNumber(2);
    }

    public int threes() {
        return countNumber(3);
    }

    private int[] buildIntArrayFromParametersList() {
        int[] tallies = new int[6];
        for (int die: dices) {
            tallies[die - 1]++;
        }
        return tallies;
    }

    public int scorePair() {
        var tallies = buildIntArrayFromParametersList();
        for (int i = 0; i < tallies.length; i++)
            if (tallies[6 - i - 1] >= 2)
                return (6 - i) * 2;
        return 0;
    }

    public int twoPair() {
        var tallies = buildIntArrayFromParametersList();
        int n = 0;
        int score = 0;
        for (int i = 0; i < tallies.length; i++)
            if (tallies[6 - i - 1] >= 2) {
                n++;
                score += (6 - i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public int fourOfAKind() {
        var tallies = buildIntArrayFromParametersList();
        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] >= 4)
                return (i + 1) * 4;
        return 0;
    }

    public int threeOfAKind() {
        var tallies = buildIntArrayFromParametersList();
        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] >= 3)
                return (i + 1) * 3;
        return 0;
    }

    public int smallStraight() {
        var tallies = buildIntArrayFromParametersList();
        for (int i = 0; i < tallies.length-1; i++) {
            if (tallies[i] != 1)
                return 0;
        }
        return 15;
    }

    public int largeStraight() {
        var tallies = buildIntArrayFromParametersList();
        for (int i = 1; i < tallies.length; i++) {
            if (tallies[i] != 1)
                return 0;
        }
        return 20;
    }

    public int fullHouse() {
        var tallies = buildIntArrayFromParametersList();
        boolean _2 = false;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }

        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }

    private int computeSumOf(int countedValue) {
        int sum = 0;
        for (int die : dices) {
            if (die == countedValue) {
                sum += countedValue;
            }
        }
        return sum;
    }

    public int fours() {
        return computeSumOf(4);
    }

    public int fives() {
        return computeSumOf(5);
    }

    public int sixes() {
        return computeSumOf(6);
    }
}



