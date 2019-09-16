package by.bsu.lab.controller;

import by.bsu.lab.beans.Necklace;
import by.bsu.lab.beans.Parameters;
import by.bsu.lab.controller.command.CommandProvider;

public class WebController {

    private static final CommandProvider provider = new CommandProvider();

    public String execute(Parameters parameters, String action){
        return provider.getCommand(action).execute(parameters);
    }

}
