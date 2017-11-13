import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GunStoreTest {
    @Test
    public void addGun() throws Exception {
        GunStore p = new GunStore();
        p.addGun("q123we", "da21", Type.BLUNDERBUSS, Power.NORMAL, 300, 9000);
        assertEquals("q123we9000.0da21BlunderbussNormal300.0_/_", p.toString());
    }

    @Test
    public void getGun() throws Exception {
        GunStore p = new GunStore();
        p.addGun("q123we", "da21", Type.BLUNDERBUSS, Power.LOW, 300, 9000);
        assertEquals("q123we9000.0da21BlunderbussLow300.0", p.getGun("q123we").toString());
    }

    @Test
    public void search() throws Exception {
        GunStore store = new GunStore();
        GunSpec liked = new GunSpec("Military", Type.MUSKET, Power.GODLY, 22);
        store.addGun("q123we", "Military", Type.MUSKET, Power.GODLY, 22, 9000);
        List matched = store.search(liked);
        assertEquals("[q123we9000.0MilitaryMusketGodly22.0]", matched.toString());
    }

}
