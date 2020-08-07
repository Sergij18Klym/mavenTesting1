import junit.framework.TestCase;
import org.junit.Assert;

public class PalindromeServiceTest extends TestCase {

    PalindromeService palEng = new PalindromeService("A'Bb a2 ");
    PalindromeService palRus = new PalindromeService("\tАбБ а ");

    public void testIsValid() {
        Assert.assertEquals(true, palEng.isValid());
        Assert.assertTrue(palRus.isValid());
    }
}