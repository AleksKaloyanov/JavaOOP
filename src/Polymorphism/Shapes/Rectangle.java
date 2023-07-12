package Polymorphism.Shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        if (this.getPerimeter() != null) {
            return this.getPerimeter();
        }

        this.setPerimeter(this.getHeight() * 2 + this.getWidth() * 2);

        return this.getPerimeter();
    }

    @Override
    public Double calculateArea() {
        if (this.getArea() != null) {
            return this.getArea();
        }
        this.setArea(this.getHeight() * this.getWidth());

        return this.getArea();
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
