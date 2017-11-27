import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private User u;
    @Before
    public void setUp() throws Exception{
        u = new User();
    }
    @Test
    public void testUser() throws Exception {
        assertEquals("User", u.getClass().getSimpleName());
    }
}