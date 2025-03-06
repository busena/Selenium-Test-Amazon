package Base;
import org.openqa.selenium.WebDriver;

public class BaseLibrary extends Data{
    public static WebDriver driver;

    public void sleep(int millis){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
