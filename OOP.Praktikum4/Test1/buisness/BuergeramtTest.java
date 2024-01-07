package buisness;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Buergeramt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class BuergeramtTest {

    private Buergeramt buergeramt;

    @BeforeEach
    void setUp() throws Exception {
        buergeramt = new Buergeramt("Müller", 7.00f, 17.00f, "Bochum 44878", new String[]{"Service1", "Service2", "Service3"});
    }

    @AfterEach
    void tearDown() throws Exception {
        buergeramt = null;
    }

//    @Test
//    void test() {
//        buergeramt.setStrasseHNr("24");
//        assertEquals("24", buergeramt.getStrasseHNr(), "Der Straßenname wurde nicht korrekt gesetzt.");
//        fail("Not yet implemented");
//    }

    @Test
    void testBuergeramtConstructor() {
        assertTrue(this.buergeramt.getGeoeffnetVon() == 7.00f);
        assertTrue(this.buergeramt.getGeoeffnetBis() == 17.00f);
        assertTrue(this.buergeramt.getStrasseHNr().equals("Bochum 44878"));

        String[] dienstleistungen = buergeramt.getDienstleistungen();
        assertEquals(3, dienstleistungen.length);
        assertEquals("Service1", dienstleistungen[0]);
        assertEquals("Service2", dienstleistungen[1]);
        assertEquals("Service3", dienstleistungen[2]);
    }
}
