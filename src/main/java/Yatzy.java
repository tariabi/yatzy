public class Yatzy {

    private final int[] dice;

    public Yatzy(int dice1, int dice2, int dice3, int dice4, int dice5) {
        dice = new int[5];
        dice[0] = dice1;
        dice[1] = dice2;
        dice[2] = dice3;
        dice[3] = dice4;
        dice[4] = dice5;
    }

    public int chance() {
        int total = 0;
        for (int die : dice) {
            total += die;
        }
        return total;
    }

    public int yatzy() {
        var tallies = buildIntArrayFromParametersList(dice[0], dice[1], dice[2], dice[3], dice[4]);
        for (int tally : tallies)
            if (tally == 5)
                return 50;
        return 0;
    }

    private int countNumber(int countedValue) {
        int sum = 0;
        if (dice[0] == countedValue) sum += countedValue;
        if (dice[1] == countedValue) sum += countedValue;
        if (dice[2] == countedValue) sum += countedValue;
        if (dice[3] == countedValue) sum += countedValue;
        if (dice[4] == countedValue) sum += countedValue;
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

    private static int[] buildIntArrayFromParametersList(int dice1, int dice2, int dice3, int dice4, int dice5) {
        int[] tallies = new int[6];
        tallies[dice1 - 1]++;
        tallies[dice2 - 1]++;
        tallies[dice3 - 1]++;
        tallies[dice4 - 1]++;
        tallies[dice5 - 1]++;
        return tallies;
    }

    public int scorePair() {
        var tallies = buildIntArrayFromParametersList(dice[0], dice[1], dice[2], dice[3], dice[4]);
        for (int i = 0; i < tallies.length; i++)
            if (tallies[6 - i - 1] >= 2)
                return (6 - i) * 2;
        return 0;
    }

    public static int twoPair(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
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

    public static int fourOfAKind(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] >= 4)
                return (i + 1) * 4;
        return 0;
    }

    public static int threeOfAKind(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] >= 3)
                return (i + 1) * 3;
        return 0;
    }

    public static int smallStraight(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        for (int i = 0; i < tallies.length-1; i++) {
            if (tallies[i] != 1)
                return 0;
        }
        return 15;
    }

    public static int largeStraight(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        for (int i = 1; i < tallies.length; i++) {
            if (tallies[i] != 1)
                return 0;
        }
        return 20;
    }

    public static int fullHouse(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
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
        for (int die : dice) {
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



