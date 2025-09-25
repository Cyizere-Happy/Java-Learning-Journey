package rw.rca.overloading;

public class BoxWeight extends Box {
    private Integer weight;

    public BoxWeight(){}

    public BoxWeight(Integer width, Integer depth, Integer heigth, Integer weight) {
        super(width, depth, heigth);
        this.weight = weight;
    }

    public BoxWeight(Integer heigth, Integer width, Integer weight) {
        super(heigth, width);
        this.weight = weight;
    }
}
