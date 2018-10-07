import org.testng.Assert;
import org.testng.annotations.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() throws StringIndexOutOfBoundsException {
        String gotString = super.getClassString();
        String elloTest = "";
        String elloSample = "ello";
        char firstSymbol = 'h';

        try {
            firstSymbol = gotString.charAt(0);
            elloTest = gotString.substring(1, 5);
        }
        catch (StringIndexOutOfBoundsException e) {
            Assert.fail("Seems that your string is NULL");
        }

        if (firstSymbol == 'h' | firstSymbol == 'H') {
        Assert.assertEquals(elloTest, elloSample, "Seems that your string does not start from \"hello\" or \"Hello\"!"); }
        else { Assert.fail("Seems that your string does not start from \"hello\" or \"Hello\"!"); }

        System.out.println("================================");
        System.out.println("The test has ended successfully!");

    }
}