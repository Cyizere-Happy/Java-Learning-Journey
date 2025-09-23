package Classes;

public class BoxShipping extends BoxWeight {
    private double cost;
    private double address;

    public BoxShipping(){}

    public BoxShipping(double weight, double height, double volume, double depth, double width, double cost, double address) {
        super(height, width, depth, weight, volume);
        this.cost = cost;
        this.address = address;
    }

    public BoxShipping(double address, double cost) {
        this.address = address;
        this.cost = cost;
    }

    public void setAddress(double address) {
        this.address = address;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public double getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Box_Shipping{" + "height="+ getHeight() +
                ", width=" + getWidth() +
                ", weight=" + getWeight()+
                ", depth=" + getDepth() +
                ", volume=" + getVolume() +
                ", cost=" + cost +
                ", address=" + address +
                '}';
    }

    @Override
    public String printMe() {
        return "Box_Shipping{" + "height="+ getHeight() +
                ", width=" + getWidth() +
                ", weight=" + getWeight()+
                ", depth=" + getDepth() +
                ", volume=" + getVolume() +
                ", cost=" + cost +
                ", address=" + address +
                '}';
    }
}
