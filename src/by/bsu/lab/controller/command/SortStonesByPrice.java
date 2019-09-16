package by.bsu.lab.controller.command;

import by.bsu.lab.beans.Parameters;
import by.bsu.lab.beans.Stone;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStonesByPrice implements Command {

    @Override
    public String execute(Parameters parameters){
    List<Stone> stones = parameters.getNecklace().getStones();
        Collections.sort(stones, new Comparator<Stone>() {
        @Override
        public int compare(Stone o1, Stone o2) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
    });
        return Arrays.toString(stones.toArray());
    }
}
