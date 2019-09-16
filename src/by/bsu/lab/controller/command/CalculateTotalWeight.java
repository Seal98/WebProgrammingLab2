package by.bsu.lab.controller.command;

import by.bsu.lab.beans.Parameters;
import by.bsu.lab.beans.Stone;

import java.util.List;

public class CalculateTotalWeight implements Command {

    @Override
    public String execute(Parameters parameters){
    List<Stone> stones = parameters.getNecklace().getStones();
    double sum = 0;
        for(Stone stone : stones){
        sum += stone.getWeight();
    }
        return String.valueOf(sum);
    }
}
