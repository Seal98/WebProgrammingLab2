package by.bsu.lab.model.factory;

import by.bsu.lab.beans.Stone;
import by.bsu.lab.beans.Opal;

public class OpalCreator extends StoneCreator {

    private static final double OPAL_CARAT_COEFFICIENT = 0.7;
    private static final double OPAL_PRICE_COEFFICIENT = 105.85;

    @Override
    public Stone buildStone(double weight, double price) {
        return new Opal(weight, price);
    }

    @Override
    public double countWeight(double weight) {
        return weight * OPAL_CARAT_COEFFICIENT;
    }

    @Override
    public double countPrice(double price) {
        return price * OPAL_PRICE_COEFFICIENT;
    }
}
