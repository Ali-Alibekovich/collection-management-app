package laba_6.Commands.SerializedCommands;

import laba_6.Commands.Command;

import java.io.Serializable;

/**
 * Команда с объектом.
 */

public class SerializedObjectCommand implements Serializable {
    private Command command;
    private Object object;

    public SerializedObjectCommand(Command command, Object object) {
        this.command = command;
        this.object = object;
    }

    public Command getCommand() {
        return command;
    }

    public Object getObject() {
        return object;
    }
}