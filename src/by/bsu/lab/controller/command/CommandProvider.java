package by.bsu.lab.controller.command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<String, Command> repository =  new HashMap<>();

    public CommandProvider(){
        repository.put(CommandKeys.SORT_STONES_BY_CARAT, new SortStonesByCarat());
        repository.put(CommandKeys.SORT_STONES_BY_PRICE, new SortStonesByPrice());
        repository.put(CommandKeys.CALCULATE_TOTAL_PRICE, new CalculateTotalPrice());
        repository.put(CommandKeys.CALCULATE_TOTAL_WEIGHT, new CalculateTotalWeight());
        repository.put(CommandKeys.FIND_STONES_BY_CRITERIA, new FindStonesByCriteria());
    }

    public Command getCommand(String name){
        return repository.get(name);
    }

}
