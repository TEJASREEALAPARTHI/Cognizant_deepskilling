import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call method
        service.fetchData();

        // Verify interaction
        verify(mockApi).getData();
    }
}
