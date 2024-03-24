package model;

import java.util.*;

public record DiceRolls(DieRoll[] rolls) {

    public int[] getSortedRollValues() {
        int[] values = new int[rolls.length];
        for (int i = 0; i < rolls.length; i++) {
            values[i] = rolls[i].toNumber();
        }
        return Arrays.stream(values).sorted().toArray();
    }

    public int countNumber(int countedValue) {
        int sum = 0;
        for (DieRoll dieRoll : rolls)
            if (dieRoll.toNumber() == countedValue)
                sum += countedValue;
        return sum;
    }

    public Map<DieRoll, Integer> buildRollsOccurrenceMap() {
        Map<DieRoll, Integer> map = new HashMap<>();
        for (DieRoll dieRoll : rolls) {
            if (!map.containsKey(dieRoll))
                map.put(dieRoll, 0);
            map.put(dieRoll, 1 + map.get(dieRoll));
        }
        return map;
    }

    public static DiceRolls fromRolls(int... rolls) {
        if (rolls.length != 5)
            throw new IllegalArgumentException("You must provide exactly 5 rolls");
        DieRoll[] tempRolls = new DieRoll[5];
        for (int i = 0; i < rolls.length; i++)
            tempRolls[i] = new DieRoll(rolls[i]);
        return new DiceRolls(tempRolls);
    }
}
