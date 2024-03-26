package model;

public class InvalidRollValueException extends RuntimeException {

    public InvalidRollValueException(int rollValue, String message) {
        super(message + ", " + rollValue);
    }
}
