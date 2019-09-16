package by.bsu.lab.view;

import by.bsu.lab.beans.Necklace;
import by.bsu.lab.beans.Parameters;
import by.bsu.lab.beans.Stone;
import by.bsu.lab.controller.WebController;
import by.bsu.lab.controller.command.CommandKeys;
import by.bsu.lab.model.factory.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StoneCreator creator = null;
        double weight = 34;
        creator = new EmeraldCreator();
        Stone emerald = creator.createStone(weight);

        weight = 76;
        creator = new OpalCreator();
        Stone opal = creator.createStone(weight);

        weight = 105;
        creator = new RubyCreator();
        Stone ruby = creator.createStone(weight);

        Necklace necklace = new Necklace();
        necklace.addStone(emerald);
        necklace.addStone(opal);
        necklace.addStone(ruby);

        WebController controller = new WebController();

        Parameters parameters = new Parameters(necklace);

        System.out.println("\n\nSorted stones by carat: "
                + controller.execute(parameters, CommandKeys.SORT_STONES_BY_CARAT));
        System.out.println("\n\nSorted stones by price: "
                + controller.execute(parameters, CommandKeys.SORT_STONES_BY_PRICE));
        System.out.println("\n\nTotal necklace price: "
                + controller.execute(parameters, CommandKeys.CALCULATE_TOTAL_PRICE));
        System.out.println("\n\nTotal necklace weight: "
                + controller.execute(parameters, CommandKeys.CALCULATE_TOTAL_WEIGHT));
        parameters = new Parameters(necklace, 2000, 3000,
                3000, 7000);
        System.out.println("\n\nFound stones by criteria: "
                + controller.execute(parameters, CommandKeys.FIND_STONES_BY_CRITERIA));
    }
}
