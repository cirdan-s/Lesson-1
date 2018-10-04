import org.junit.Assert;
import org.junit.Test;


    public class MainClassTest extends MainClass
{

    @Test
    public void testGetLocalNumber()
        {
            int a = super.getLocalNumber();
            Assert.assertTrue("Local number is set incorrectly",a  == 14);
        }

}
