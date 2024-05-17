package org.example.chapter6_command.command;

import org.example.chapter6_command.reciver.Light;

public class LightOffCommand implements Command{
    Light light;

    @Override
    public void execute() {
        light.off();
    }
}
