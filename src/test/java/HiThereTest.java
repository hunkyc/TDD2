import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HiThereTest {
    @Test
    public void testHiThere() throws Exception {
        HiThere h = new HiThere("Martin");
        assertTrue(h.getOutput().equals("Hi there Martin"));
    }
}