package by.bsu.lab.beans;

public abstract class Stone {

    private double weight;
    private double price;

    public Stone(){
        super();
    }

    public Stone(double weight, double price){
        this.weight = weight;
        this.price = price;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getWeight(){
        return weight;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(o == this){
            return true;
        }
        if(o.getClass().getName().compareTo(Stone.class.getName()) != 0){
            return false;
        }
        Stone figure = (Stone) o;
        return weight == figure.weight && price == figure.price;
    }

    @Override
    public int hashCode(){
        return (int)(weight + price * 100);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ":   weight: " + weight + ",  price: " + price;
    }

}
