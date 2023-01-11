package EncapsulationEx.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalStateException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalStateException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalStateException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateSurfaceArea() {
        return (2 * this.getHeight() * this.getLength()) +
                (2 * this.getHeight() * this.getWidth()) +
                (2 * this.getWidth() * this.getLength());
    }

    public double calculateLateralSurfaceArea() {
        return (2 * this.getLength() * this.getHeight()) +
                (2 * this.getHeight() * this.getWidth());
    }

    public double calculateVolume() {
        return this.getWidth() * this.getLength() * this.getHeight();
    }
}
