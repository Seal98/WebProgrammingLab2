package by.bsu.lab.controller.command;

import by.bsu.lab.beans.Parameters;

public interface Command {

    public abstract String execute(Parameters parameters);

}
