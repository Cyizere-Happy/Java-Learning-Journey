package Classes;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(){

    }

    public BoxWeight(double height, double width, double depth, double volume, double weight){
        super(depth, height, width, volume);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Box_Weight{" +
                "weight=" + weight +
                ", height=" + getHeight() +
                ", width=" + getWidth() +
                ", depth=" + getDepth()+
                ", volume=" + getVolume()+
                '}';
    }

    @Override
    public String printMe() {
        return "Box_Weight{" +
                "weight=" + weight +
                ", height=" + getHeight() +
                ", width=" + getWidth() +
                ", depth=" + getDepth()+
                ", volume=" + getVolume()+
                '}';
    }
}
