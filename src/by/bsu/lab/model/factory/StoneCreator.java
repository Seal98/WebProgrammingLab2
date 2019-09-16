package by.bsu.lab.model.factory;

import by.bsu.lab.beans.Stone;

public abstract class StoneCreator {

    /**
     * Creates the stone object
     *
     * @param weight - weight in kilograms
     * @return - link to the stone
     */
    public Stone createStone(double weight){
        double carat = this.countPrice(weight);
        double price = this.countWeight(carat);
        return this.buildStone(carat, price);
    }


    /**
     * Creates the specific stone object based on the creator link
     *
     * @param weight - carat weight
     * @param price - stone price
     * @return - link to the stone
     */
    public abstract Stone buildStone(double weight, double price);

    /**
     * Calculates the stone weight in carat
     *
     * @param weight - weight in kilograms
     * @return - weight in carat
     */
    public abstract double countWeight(double weight);

    /**
     * Calculates the stone price
     *
     * @param weight - weight in carat
     * @return - price in dollars
     */
    public abstract double countPrice(double weight);

}
