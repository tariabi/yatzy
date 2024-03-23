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

    public static int chance(int dice1, int dice2, int dice3, int dice4, int dice5) {
        int total = 0;
        total += dice1;
        total += dice2;
        total += dice3;
        total += dice4;
        total += dice5;
        return total;
    }

    public static int yatzy(int... dice) {
        int[] counts = new int[6];
        for (int die : dice)
            counts[die - 1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;
    }

    private static int count_number(int dice1, int dice2, int dice3, int dice4, int dice5, int countedValue) {
        int sum = 0;
        if (dice1 == countedValue) sum += countedValue;
        if (dice2 == countedValue) sum += countedValue;
        if (dice3 == countedValue) sum += countedValue;
        if (dice4 == countedValue) sum += countedValue;
        if (dice5 == countedValue) sum += countedValue;
        return sum;
    }

    public static int ones(int dice1, int dice2, int dice3, int dice4, int dice5) {
        return count_number(dice1, dice2, dice3, dice4, dice5, 1);
    }

    public static int twos(int dice1, int dice2, int dice3, int dice4, int dice5) {
        return count_number(dice1, dice2, dice3, dice4, dice5, 2);
    }

    public static int threes(int dice1, int dice2, int dice3, int dice4, int dice5) {
        return count_number(dice1, dice2, dice3, dice4, dice5, 3);
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

    public static int score_pair(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        int at;
        for (at = 0; at != 6; at++)
            if (tallies[6 - at - 1] >= 2)
                return (6 - at) * 2;
        return 0;
    }

    public static int two_pair(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        int n = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1)
            if (tallies[6 - i - 1] >= 2) {
                n++;
                score += (6 - i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public static int four_of_a_kind(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        for (int i = 0; i < 6; i++)
            if (tallies[i] >= 4)
                return (i + 1) * 4;
        return 0;
    }

    public static int three_of_a_kind(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        for (int i = 0; i < tallies.length; i++)
            if (tallies[i] >= 3)
                return (i + 1) * 3;
        return 0;
    }

    public static int smallStraight(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        if (tallies[0] == 1 &&
            tallies[1] == 1 &&
            tallies[2] == 1 &&
            tallies[3] == 1 &&
            tallies[4] == 1)
            return 15;
        return 0;
    }

    public static int largeStraight(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        if (tallies[1] == 1 &&
            tallies[2] == 1 &&
            tallies[3] == 1 &&
            tallies[4] == 1
            && tallies[5] == 1)
            return 20;
        return 0;
    }

    public static int fullHouse(int dice1, int dice2, int dice3, int dice4, int dice5) {
        var tallies = buildIntArrayFromParametersList(dice1, dice2, dice3, dice4, dice5);
        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i + 1;
            }

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i + 1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }

    public int fours() {
        int sum = 0;
        for (int die : dice) {
            if (die == 4) {
                sum += 4;
            }
        }
        return sum;
    }

    public int fives() {
        int sum = 0;
        for (int die : dice)
            if (die == 5)
                sum += 5;
        return sum;
    }

    public int sixes() {
        int sum = 0;
        for (int die : dice)
            if (die == 6)
                sum = sum + 6;
        return sum;
    }
}



