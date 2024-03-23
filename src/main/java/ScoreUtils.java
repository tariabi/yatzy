public class ScoreUtils {

    public int[] buildIntArrayFromParametersList(DiceRolls diceRolls) {
        int[] tallies = new int[6];
        for (DieRoll die: diceRolls.getRolls()) {
            tallies[die.toNumber() - 1]++;
        }
        return tallies;
    }

    public int countNumber(DiceRolls diceRolls, int countedValue) {
        int sum = 0;
        if (diceRolls.getRolls()[0].toNumber() == countedValue) sum += countedValue;
        if (diceRolls.getRolls()[1].toNumber() == countedValue) sum += countedValue;
        if (diceRolls.getRolls()[2].toNumber() == countedValue) sum += countedValue;
        if (diceRolls.getRolls()[3].toNumber() == countedValue) sum += countedValue;
        if (diceRolls.getRolls()[4].toNumber() == countedValue) sum += countedValue;
        return sum;
    }

}
