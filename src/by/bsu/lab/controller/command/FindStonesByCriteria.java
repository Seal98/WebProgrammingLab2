package by.bsu.lab.controller.command;

import by.bsu.lab.beans.Parameters;
import by.bsu.lab.beans.Stone;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindStonesByCriteria implements Command{

    @Override
    public String execute(Parameters parameters) {
        List<Stone> stones = parameters.getNecklace().getStones();
        List<Stone> filteredStone = new LinkedList<>();
        for (Stone stone : stones) {
            double weight = stone.getWeight();
            double price = stone.getPrice();
            double lowerBorderPriceSearch = parameters.getLowerBorderPriceSearch();
            double upperBorderPriceSearch = parameters.getUpperBorderPriceSearch();
            double lowerBorderWeightSearch = parameters.getLowerBorderWeightSearch();
            double upperBorderWeightSearch = parameters.getUpperBorderWeightSearch();
            if (weight >= lowerBorderWeightSearch && weight <= upperBorderWeightSearch
                    && price >= lowerBorderPriceSearch && price <= upperBorderPriceSearch) {
                filteredStone.add(stone);
            }
        }
        return Arrays.toString(filteredStone.toArray());
    }
}
