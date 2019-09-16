package by.bsu.lab.beans;

import java.util.LinkedList;
import java.util.List;

public class Necklace {

    private List<Stone> stones;

    public Necklace(){
        super();
        stones = new LinkedList<>();
    }

    public void addStone(Stone stone){
        stones.add(stone);
    }

    public void setStones(List<Stone> stones) {
        this.stones = stones;
    }

    public List<Stone> getStones() {
        return stones;
    }

}
