import java.util.logging.Logger;

public class Rectangle {

    private static final Logger logger = Logger.getLogger(Rectangle.class.getName());

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        logger.info("method getArea has been called");
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter() {
        logger.info("method getPerimeter has been called");
        return 2*(this.getLength() + this.getWidth());
    }
}
