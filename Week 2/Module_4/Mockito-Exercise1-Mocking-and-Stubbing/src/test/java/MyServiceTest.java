import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stubbing
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call method
        String result = service.fetchData();

        // Assert result
        assertEquals("Mock Data", result);
    }
}
