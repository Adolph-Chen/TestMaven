import com.example.Test2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
//import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(JUnit4.class)
public class TestTest2 {
    @Test
    public void testPrint() {
        new Test2().print("hhhh");
    }
}
