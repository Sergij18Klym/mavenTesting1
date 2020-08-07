import junit.framework.TestCase;
import org.junit.Assert;

public class CircleTest extends TestCase {

    Circle circle = new Circle(5);

    public void testGetArea() {
        Assert.assertEquals(78.5, circle.getArea(),0.1);
    }

    public void testGetLength() {
        Assert.assertEquals(31.4, circle.getLength(), 0.1);
    }
}