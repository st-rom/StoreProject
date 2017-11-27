import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObservableTest {
    private Observable o;
    @Before
    public void setUp() throws Exception{
        o = new Observable();
    }
    @Test
    public void addObserver() throws Exception {
        o.addObserver(new User());
        o.addObserver(new User());
        assertEquals(2, o.observers.size());
    }

    @Test
    public void removeObserver() throws Exception {
        o.addObserver(new User());
        User u = new User();
        o.addObserver(u);
        o.removeObserver(u);
        assertEquals(1, o.observers.size());
    }

    @Test
    public void notifyObservers() throws Exception{
        o.notifyObservers();
        assertEquals("Observable", o.getClass().getSimpleName());
    }

}