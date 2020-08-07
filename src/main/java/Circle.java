import java.util.logging.Logger;

public class Circle {

    private static final Logger logger = Logger.getLogger(Circle.class.getName());

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        logger.info("METHOD_CIRCLE_GETAREA_CALLED");
        return Math.PI * this.getRadius() * this.getRadius();
    }

    public double getLength() {
        logger.info("METHOD_CIRCLE_GETLENGTH_CALLED");
        return 2 * Math.PI * this.getRadius();
    }
}
