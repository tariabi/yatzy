import java.util.Arrays;

public class DiceRolls {

    private final DieRoll[] rolls;
    public DiceRolls(DieRoll[] rolls) {
        this.rolls = rolls;
    }

    public DieRoll[] getRolls() {
        return rolls;
    }

    public int[] getSortedRollValues() {
        int[] values = new int[rolls.length];
        for (int i = 0; i < rolls.length; i++) {
            values[i] = rolls[i].toNumber();
        }
        return Arrays.stream(values).sorted().toArray();
    }
}
