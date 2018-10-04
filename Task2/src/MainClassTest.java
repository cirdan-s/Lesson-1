import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber() {
        int classNumber = super.getClassNumber();
        Assert.assertTrue("Returned number is greater than 45 and is equal to " + classNumber,classNumber < 45);
    }

}
