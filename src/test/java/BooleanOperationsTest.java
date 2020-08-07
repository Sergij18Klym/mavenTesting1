import junit.framework.TestCase;
import org.junit.Assert;

public class BooleanOperationsTest extends TestCase {

    BooleanOperations boolOp00 = new BooleanOperations(false,false);
    BooleanOperations boolOp01 = new BooleanOperations(false,true);
    BooleanOperations boolOp10 = new BooleanOperations(true,false);
    BooleanOperations boolOp11 = new BooleanOperations(true,true);

    BooleanOperations boolOp0Null = new BooleanOperations(false,null);
    BooleanOperations boolOp1Null = new BooleanOperations(true,null);
    BooleanOperations boolOpNull0 = new BooleanOperations(null,false);
    BooleanOperations boolOpNull1 = new BooleanOperations(null,true);
    BooleanOperations boolOpNullNull = new BooleanOperations(null,null);

    public void testConjunction() {
        Assert.assertEquals(false, boolOp00.conjunction());
        Assert.assertEquals(false, boolOp01.conjunction());
        Assert.assertEquals(false, boolOp10.conjunction());
        Assert.assertEquals(true, boolOp11.conjunction());

        Assert.assertEquals(null, boolOp0Null.conjunction());
        Assert.assertEquals(null, boolOp1Null.conjunction());
        Assert.assertEquals(null, boolOpNull0.conjunction());
        Assert.assertEquals(null, boolOpNull1.conjunction());
        Assert.assertEquals(null, boolOpNullNull.conjunction());
    }

    public void testDisjunction() {
        Assert.assertEquals(false, boolOp00.disjunction());
        Assert.assertEquals(true, boolOp01.disjunction());
        Assert.assertEquals(true, boolOp10.disjunction());
        Assert.assertEquals(true, boolOp11.disjunction());

        Assert.assertEquals(false, boolOp0Null.disjunction());
        Assert.assertEquals(true, boolOp1Null.disjunction());
        Assert.assertEquals(false, boolOpNull0.disjunction());
        Assert.assertEquals(true, boolOpNull1.disjunction());
        Assert.assertEquals(null, boolOpNullNull.disjunction());
    }
}