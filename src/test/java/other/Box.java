package other;

public class Box {

    private double width;
    private double height;
    private double depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Box{" +
                "Ширина=" + width +
                ", Высота=" + height +
                ", Глубина=" + depth +
                '}';
    }
}