package rw.rca.overloading;

public class Box {
    private Integer width;
    private Integer heigth;
    private Integer depth;

    public Box() {
    }

    public Box(Integer width, Integer depth, Integer heigth) {
        this.width = width;
        this.depth = depth;
        this.heigth = heigth;
    }

    public Box(Integer heigth, Integer width) {
        this.heigth = heigth;
        this.width = width;
    }

}
