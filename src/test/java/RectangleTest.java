//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(3,4);

    @org.junit/*.jupiter.api*/.Test
    public void whenHeight3Width4ThenArea12() {
        Assert.assertEquals(12, rectangle.getArea(),0.01);
    }

    @org.junit/*.jupiter.api*/.Test
    public void whenHeight3Width4ThenPerimeter14() {
        Assert.assertEquals(14, rectangle.getPerimeter(),0.01);
    }
}