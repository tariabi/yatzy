package model;

public record DieRoll(int roll) {
    public DieRoll(int roll) {
        if (roll >= 1 && roll <= 6) {
            this.roll = roll;
            return;
        }
        throw new IllegalArgumentException("Not an acceptable die value:" + roll);
    }

    public int toNumber() {
        return roll;
    }

    public static DieRoll of(int value) {
        return new DieRoll(value);
    }
}
