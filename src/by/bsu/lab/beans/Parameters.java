package by.bsu.lab.beans;

public class Parameters {

    private Necklace necklace;
    private double lowerBorderPriceSearch;
    private double upperBorderPriceSearch;
    private double lowerBorderWeightSearch;
    private double upperBorderWeightSearch;

    public Parameters(){
        super();
    }

    public Parameters(Necklace necklace){
        this.necklace = necklace;
    }

    public Parameters(Necklace necklace, double lowerBorderPriceSearch, double upperBorderPriceSearch,
                      double lowerBorderWeightSearch, double upperBorderWeightSearch){
        this(necklace);
        this.lowerBorderPriceSearch = lowerBorderPriceSearch;
        this.lowerBorderWeightSearch = lowerBorderWeightSearch;
        this.upperBorderPriceSearch = upperBorderPriceSearch;
        this.upperBorderWeightSearch = upperBorderWeightSearch;
    }

    public Necklace getNecklace() {
        return necklace;
    }

    public void setNecklace(Necklace necklace) {
        this.necklace = necklace;
    }

    public double getLowerBorderPriceSearch() {
        return lowerBorderPriceSearch;
    }

    public void setLowerBorderPriceSearch(double lowerBorderPriceSearch) {
        this.lowerBorderPriceSearch = lowerBorderPriceSearch;
    }

    public double getUpperBorderPriceSearch() {
        return upperBorderPriceSearch;
    }

    public void setUpperBorderPriceSearch(double upperBorderPriceSearch) {
        this.upperBorderPriceSearch = upperBorderPriceSearch;
    }

    public double getLowerBorderWeightSearch() {
        return lowerBorderWeightSearch;
    }

    public void setLowerBorderWeightSearch(double lowerBorderWeightSearch) {
        this.lowerBorderWeightSearch = lowerBorderWeightSearch;
    }

    public double getUpperBorderWeightSearch() {
        return upperBorderWeightSearch;
    }

    public void setUpperBorderWeightSearch(double upperBorderWeightSearch) {
        this.upperBorderWeightSearch = upperBorderWeightSearch;
    }
}
