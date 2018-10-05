import com.sun.tools.javac.util.Assert;
import org.junit.Test;

public class TestClass extends MainClass {

    @Test
    public void testGetClassString() {
        String gotString = super.getClassString();
        char firstSymbol = gotString.charAt(0);

     /*   System.out.println(firstSymbol);
        System.out.println(gotString); */

        if (firstSymbol == ('H')) {
            if (gotString.contains("ello")) {
                System.out.println("Your string starts from \"hello\" or \"Hello\": " + gotString);
             }
             else Assert.error("Seems that your string does not start from \"hello\" or \"Hello\": " + gotString);
        }
        else if (firstSymbol == ('h')) {
            if (gotString.contains("ello")) {
                System.out.println("Your string starts from \"hello\" or \"Hello\": " + gotString);
             }
             else Assert.error("Seems that your string does not start from \"hello\" or \"Hello\": " + gotString);
        }
        else Assert.error("Seems that your string does not start from \"hello\" or \"Hello\": " + gotString);

        System.out.println("==================");
        System.out.println("The test has ended");
    }
}
