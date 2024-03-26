package model;

import java.util.*;

public record DiceRolls(DieRoll[] rolls) {
    public static final int NUMBER_OF_DIE_ROLLS = 5;

    public int rollValueFrequency(int countedValue) {
        var rollValueFrequencies = rollValueFrequencies();
        DieRoll searchedRoll = DieRoll.of(countedValue);
        if (rollValueFrequencies.containsKey(searchedRoll))
            return rollValueFrequencies.get(searchedRoll);
        return 0;
    }

    public Map<DieRoll, Integer> rollValueFrequencies() {
        Map<DieRoll, Integer> map = new HashMap<>();
        for (DieRoll dieRoll : rolls) {
            map.putIfAbsent(dieRoll, 0);
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
        var rollValues = Arrays.stream(rolls).mapToInt(DieRoll::toNumber).toArray();
        Arrays.sort(rollValues);
        return Arrays.equals(rollValues, new int[] {1,2,3,4,5})
        || Arrays.equals(rollValues, new int[] {2,3,4,5,6});
    }

    public List<DieRoll> findRollsWithOccurrences(int rollOccurrences) {
       return new ArrayList<>(rollValueFrequencies().entrySet().stream()
            .filter(entry -> entry.getValue() >= rollOccurrences)
            .map(Map.Entry::getKey).toList());
    }
}
