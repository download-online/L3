package ru.jaba.lab;

public enum MovementType {
    COME("прийти"), LEAVE("уйти"), APPEAR("явиться");
    private final String text;
    MovementType(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return text;
    }
}
