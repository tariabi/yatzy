public class ScoreUtils {

    public int[] buildIntArrayFromParametersList(DieRoll[] dices) {
        int[] tallies = new int[6];
        for (DieRoll die: dices) {
            tallies[die.toNumber() - 1]++;
        }
        return tallies;
    }

    public int countNumber(DieRoll[] dices, int countedValue) {
        int sum = 0;
        if (dices[0].toNumber() == countedValue) sum += countedValue;
        if (dices[1].toNumber() == countedValue) sum += countedValue;
        if (dices[2].toNumber() == countedValue) sum += countedValue;
        if (dices[3].toNumber() == countedValue) sum += countedValue;
        if (dices[4].toNumber() == countedValue) sum += countedValue;
        return sum;
    }

}
