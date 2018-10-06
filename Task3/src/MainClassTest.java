import org.testng.Assert;
import org.testng.annotations.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        String gotString = super.getClassString();
        char firstSymbol = gotString.charAt(0);
        String elloTest = gotString.substring(1, 5);
        String elloSample = "ello";

        if (firstSymbol == 'h' | firstSymbol == 'H') {
        Assert.assertEquals(elloTest, elloSample, "main: Seems that your string does not start from \"hello\" or \"Hello\"!"); }
        else { Assert.fail("else: Seems that your string does not start from \"hello\" or \"Hello\"!"); }

        System.out.println("================================");
        System.out.println("The test has ended successfully!");

    }
}