public class ScoreUtils {

    public int[] buildIntArrayFromParametersList(int[] dices) {
        int[] tallies = new int[6];
        for (int die: dices) {
            tallies[die - 1]++;
        }
        return tallies;
    }

    public int countNumber(int[] dices, int countedValue) {
        int sum = 0;
        if (dices[0] == countedValue) sum += countedValue;
        if (dices[1] == countedValue) sum += countedValue;
        if (dices[2] == countedValue) sum += countedValue;
        if (dices[3] == countedValue) sum += countedValue;
        if (dices[4] == countedValue) sum += countedValue;
        return sum;
    }

}
