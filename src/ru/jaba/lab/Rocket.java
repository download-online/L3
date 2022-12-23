package ru.jaba.lab;

public class Rocket extends Named implements Visible {
    public Rocket(String name){
        super(name);
    }
    public String describe() {
        return "космическую ракету";
    }


}
