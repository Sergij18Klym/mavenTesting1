import junit.framework.TestCase;
import org.junit.Assert;

public class QuadratTest extends TestCase {

    Quadrat qu = new Quadrat(5);

    public void testGetArea() {
        Assert.assertEquals(25, qu.getArea(), 0.01);
    }
}