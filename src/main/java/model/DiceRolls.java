package model;

import java.util.*;

public record DiceRolls(DieRoll[] rolls) {
    public static final int NUMBER_OF_DIE_ROLLS = 5;

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
        if (rolls.length != NUMBER_OF_DIE_ROLLS)
            throw new IllegalArgumentException(String.format("You must provide exactly %d rolls", NUMBER_OF_DIE_ROLLS));
        DieRoll[] tempRolls = new DieRoll[NUMBER_OF_DIE_ROLLS];
        for (int i = 0; i < rolls.length; i++)
            tempRolls[i] = DieRoll.of(rolls[i]);
        return new DiceRolls(tempRolls);
    }

    public int sumRolls() {
        int sum = 0;
        for (DieRoll die : rolls())
            sum += die.toNumber();
        return sum;
    }

    public boolean isSequence() {
        var rollValues = arrayRollValues();
        Arrays.sort(rollValues);
        return Arrays.equals(rollValues, new int[] {1,2,3,4,5})
        || Arrays.equals(rollValues, new int[] {2,3,4,5,6});
    }

    private int[] arrayRollValues() {
        int[] arrayRollValues = new int[NUMBER_OF_DIE_ROLLS];
        int index = 0;
        for(DieRoll roll: rolls) {
            arrayRollValues[index++] = roll.toNumber();
        }
        return arrayRollValues;
    }

    public List<DieRoll> findRollsWithOccurrences(int rollOccurrences) {
       return new ArrayList<>(buildRollsOccurrenceMap().entrySet().stream()
            .filter(entry -> entry.getValue() >= rollOccurrences)
            .map(Map.Entry::getKey).toList());
    }
}
