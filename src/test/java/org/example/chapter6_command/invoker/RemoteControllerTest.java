package org.example.chapter6_command.invoker;

import org.example.chapter6_command.command.LightOnCommand;
import org.example.chapter6_command.reciver.Light;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControllerTest {

    @Test
    public void test() {

        Light light = new Light();

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(light::on);
        remoteController.pressButton();

    }

}