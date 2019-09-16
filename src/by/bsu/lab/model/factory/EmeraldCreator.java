package by.bsu.lab.model.factory;

import by.bsu.lab.beans.Stone;
import by.bsu.lab.beans.Emerald;

public class EmeraldCreator extends StoneCreator {

    private static final double EMERALD_CARAT_COEFFICIENT = 0.7;
    private static final double EMERALD_PRICE_COEFFICIENT = 105.85;

    @Override
    public Stone buildStone(double weight, double price) {
        return new Emerald(weight, price);
    }

    @Override
    public double countWeight(double weight) {
        return weight * EMERALD_CARAT_COEFFICIENT;
    }

    @Override
    public double countPrice(double price) {
        return price * EMERALD_PRICE_COEFFICIENT;
    }
}
