package org.example.chapter6_command.command;

import org.example.chapter6_command.reciver.Light;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
