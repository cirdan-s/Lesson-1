import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass {

    String gotString = super.getClassString();
    String elloTest;
    String elloSample = "ello";
    char firstSymbol = 'h';
    boolean result = false;

    @Before
    public void Initialize() throws StringIndexOutOfBoundsException {
        System.out.println("==================================");
        System.out.println("Starting test...");
        System.out.println("==================================");

        if (gotString == null) {
            System.out.println("Received string is: " + gotString);
            Assert.fail("Seems that your string is NULL");
        }
        else {
             try {
                firstSymbol = gotString.charAt(0);
                int length = gotString.length();
                if (length > 5) {
                elloTest = gotString.substring(1, 5); }
                else {   System.out.println("Received string is less than 5 symbols");
                    Assert.fail("Received string is less than 5 symbols");
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Received string is: EMPTY");
                Assert.fail("Seems that your string is EMPTY");
            }
        }

        System.out.println("Received string is: " + gotString);

    }

    @Test
    public void testGetClassString() {

        if (firstSymbol == 'h' | firstSymbol == 'H') {
            Assert.assertEquals("Seems that your string does not start from \"hello\" or \"Hello\"!", elloSample, elloTest); }
            //Assert.assertEquals(elloTest, elloSample, "Seems that your string does not start from \"hello\" or \"Hello\"!"); }
        else { Assert.fail("Seems that your string does not start from \"hello\" or \"Hello\"!"); }
        result = true;

    }

    @After
    public void TearDown() {
        System.out.println("==================================");
        if (result) { System.out.println("The test has ended successfully!"); }
        else System.out.println("The test has ended unsuccessfully!");
        System.out.println("==================================");
    }
}