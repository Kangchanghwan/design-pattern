package org.example.chapter6_command.invoker;

import org.example.chapter6_command.command.Command;

public class RemoteController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
}
