package Classes;

public class Box {
    private double height;
    private double width;
    private double depth;
    private double volume;

    public Box(){}

    public Box(double height, double width, double depth, double volume) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.volume = volume;
    }

    public Box(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Box_Class{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", volume=" + volume +
                '}';
    }


    public String printMe(){
        return "Box_Class{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", volume=" + volume +
                '}';
    }
}
