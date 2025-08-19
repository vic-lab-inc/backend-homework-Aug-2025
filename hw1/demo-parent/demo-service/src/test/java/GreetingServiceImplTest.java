import com.vic.api.GreetingService;
import com.vic.service.GreetingServiceImpl;
import org.junit.Test;

public class GreetingServiceImplTest {
    @Test
    public void testGreetingService() {
        GreetingService greetingService = new GreetingServiceImpl();
        greetingService.greeting("World");
    }
}
