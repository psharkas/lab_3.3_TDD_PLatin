import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TDDPigLatinTest {

	
	@Test
	void testTranslate1() {
		String expected = "appleway";
		String actual = TDDPigLatin.translate("APPLE");
		assertEquals(expected,actual);
	}
	
	@Test
	void testTranslate2() {
		String expected = "intricateway";
		String actual = TDDPigLatin.translate("INTriCaTE");
		assertEquals(expected,actual);
	}
	
	@Test
	void testTranslate3() {
		String expected = "oreganoway";
		String actual = TDDPigLatin.translate("OREGANO");
		assertEquals(expected,actual);
	}
	
	@Test
	void testTranslate4() {
		String expected = "enigmaway";
		String actual = TDDPigLatin.translate("ENiGma");
		assertEquals(expected,actual);
	}
	
	@Test
	void testTranslate5() {
		String expected = "usurpway";
		String actual = TDDPigLatin.translate("usUrp");
		assertEquals(expected,actual);
	}
	
	@Test
	void testTranslate6() {
		String expected = "omehay";
		String actual = TDDPigLatin.translate("HoME");
		assertEquals(expected,actual);
	}

	@Test
	void testTranslate7() {
		String expected = "aperpay";
		String actual = TDDPigLatin.translate("PAPER");
		assertEquals(expected,actual);
	}
	
	@Test
	void testTranslate8() {
		String expected = "iverdray";
		String actual = TDDPigLatin.translate("DriVER");
		assertEquals(expected,actual);
	}
	
	@Test
	void testTranslate9() {
		String expected = "ayspray";
		String actual = TDDPigLatin.translate("SPRAY");
		assertEquals(expected,actual);
	}
	
	@Test
	void testLowercase() {
		String expected = "apple";
		String actual = TDDPigLatin.lowercase("APPLE");
		assertEquals(expected,actual);
	}

}
