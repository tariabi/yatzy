package model;

public class InvalidRollNumberException extends RuntimeException {

    public InvalidRollNumberException(int rollNumber, String message) {
        super(message + ", " + rollNumber);
    }
}
