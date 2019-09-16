package by.bsu.lab.model.service;

import by.bsu.lab.beans.Stone;

import java.util.List;

public class QuadrangleService {

    private QuadrangleService(){
        super();
    }

    private static class SingletonHandler{
        private static final QuadrangleService instance = new QuadrangleService();
    }

    public static QuadrangleService getInstance(){
        return SingletonHandler.instance;
    }

    /**
     * @param stones includes stones of different types
     * @return link to the quadrangle with the minimal area among all ones inside list
     */
    public Stone getMinimumAreaQuadrangle(List<Stone> stones){
        double minArea = stones.get(0).getWeight();
        Stone minAreaStone = stones.get(0);
        for(Stone stone : stones){
            if(stone.getWeight() < minArea){
                minAreaStone = stone;
                minArea = stone.getWeight();
            }
        }
        return minAreaStone;
    }


    /**
     * @param stones includes stones of different types
     * @return link to the quadrangle with the maximal area among all ones inside list
     */
    public Stone getMaximumAreaQuadrangle(List<Stone> stones){
        double maxArea = stones.get(0).getWeight();
        Stone maxAreaStone = stones.get(0);
        for(Stone stone : stones){
            if(stone.getWeight() > maxArea){
                maxAreaStone = stone;
                maxArea = stone.getWeight();
            }
        }
        return maxAreaStone;
    }


    /**
     * @param stones includes stones of different types
     * @return link to the quadrangle with the minimal perimeter among all ones inside list
     */
    public Stone getMinimumPerimeterQuadrangle(List<Stone> stones){
        double minPerimeter = stones.get(0).getPrice();
        Stone minPerimeterStone = stones.get(0);
        for(Stone stone : stones){
            if(stone.getPrice() < minPerimeter){
                minPerimeterStone = stone;
                minPerimeter = stone.getPrice();
            }
        }
        return minPerimeterStone;
    }


    /**
     * @param stones includes stones of different types
     * @return link to the quadrangle with the maximal perimeter among all ones inside list
     */
    public Stone getMaximumPerimeterQuadrangle(List<Stone> stones){
        double minPerimeter = stones.get(0).getPrice();
        Stone maxPerimeterStone = stones.get(0);
        for(Stone stone : stones){
            if(stone.getPrice() > minPerimeter){
                maxPerimeterStone = stone;
                minPerimeter = stone.getPrice();
            }
        }
        return maxPerimeterStone;
    }

}
