import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KalenderTest {
	Kalender kalender;
	
	@BeforeAll
	void setUp() throws Exception {
		kalender = new Kalender();
	}

	@AfterAll
	void tearDown() throws Exception {
		kalender = null;
	}

	@Test
	@DisplayName("Ein Tag im Januar")
	void testTagimJanuar() {
		int tag = 5;
		int monat = 1;
		
		boolean actualResult = kalender.tagGueltig(tag, monat);
		
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Ein Tag im Februar")
	void testTagimFebruar() {
		int tag = 28;
		int monat = 2;
		
		boolean actualResult = kalender.tagGueltig(tag, monat);
		
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Ein Tag im Juni")
	void testTagimJuni() {
		int tag = 5;
		int monat = 6;
		
		boolean actualResult = kalender.tagGueltig(tag, monat);
		
		assertTrue(!actualResult);
	}
	
	@Test
	@DisplayName("Ungueltige Eingabeparameter")
	void testUngueltigesDatum() {
		int tag = 50;
		int monat = 100;
		
		boolean actualResult = kalender.tagGueltig(tag, monat);
		
		assertTrue(!actualResult);
	}
}
