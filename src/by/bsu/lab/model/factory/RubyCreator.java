package by.bsu.lab.model.factory;

import by.bsu.lab.beans.Ruby;
import by.bsu.lab.beans.Stone;

public class RubyCreator extends StoneCreator {

    private static final double RUBY_CARAT_COEFFICIENT = 0.35;
    private static final double RUBY_PRICE_COEFFICIENT = 65.85;

    @Override
    public Stone buildStone(double weight, double price) {
        return new Ruby(weight, price);
    }

    @Override
    public double countWeight(double weight) {
        return weight * RUBY_CARAT_COEFFICIENT;
    }

    @Override
    public double countPrice(double price) {
        return price * RUBY_PRICE_COEFFICIENT;
    }
}
