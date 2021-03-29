import org.junit.Assert;
import org.junit.Test;

public class MainClassTest{

    MainClass Main = new MainClass();


    @Test
    public void checkGetLocalNumber() {
        int numberOne = 14;
        int numberTwo = Main.getLocalNumber();
        Assert.assertTrue("LocalNumber not equal 14", numberOne == numberTwo);

    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber returns a number less than 45",Main.getClassNumber() >= 45);
    }



}
