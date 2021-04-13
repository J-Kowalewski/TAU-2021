import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @Mock
    Database databaseMock;

    @Test
    public void testQuery() {
        assertNotNull(databaseMock);
        when(databaseMock.isAvailable()).thenReturn(true);
        Service s = new Service(databaseMock);
        boolean check = s.query("* from s");
        assertTrue(check);
    }

    @Test
    public void testReturningCorrectValue() {
        when(databaseMock.getUniqueId()).thenReturn(42);
        Service service = new Service(databaseMock);
        assertEquals(service.toString(), "Using database with id: 42");
    }

    private User stub1 = new User("user1","user1");
    private User stub2 = new User("user2","user3");
    private User stub3 = new User("user2","user3");

    @Test
    public void testGettingUsers() {
        databaseMock.addUser(stub1);
        databaseMock.addUser(stub2);
        databaseMock.addUser(stub3);
        Service service = new Service(databaseMock);
        assertEquals(service.returnlUser(1),stub2);
    }
}
