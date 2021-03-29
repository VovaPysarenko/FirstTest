import org.junit.Assert;
import org.junit.Test;

public class MainClassTest{

    MainClass Main = new MainClass();


    @Test
    public void checkGetLocalNumber() {
        int numberOne = 14;
        Assert.assertTrue("LocalNumber not equal 14", numberOne == Main.getLocalNumber());

    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber returns a number less than 45",Main.getClassNumber() >= 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue(
                "getClassString does not contain word Hello or hello",
                Main.getClassString().contains("Hello") || Main.getClassString().contains("hello")
        );
    }



}
