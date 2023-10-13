package tests;


import init.InitialDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;

public class Positive1 extends InitialDriver {

    @Test
    public void successLogin() throws InterruptedException {
        sleep(5000);
    }
}
