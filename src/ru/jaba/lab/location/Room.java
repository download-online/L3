package ru.jaba.lab.location;

import ru.jaba.lab.*;

public class Room extends Circumstances implements Visitable {
    public Room(String name) {
        super(name);
    }
    @Override
    public String isDirection() {
        return "в комнату";
    }
    @Override
    public String isLocation() {
        return "в комнате";
    }
}
