import org.junit.Test
import static org.junit.Assert.assertEquals;

class RomanNumeralTest {

    @Test(expected = GroovyRuntimeException.class)
    public void shouldNotAcceptBigDecimalInConstructor()  {
        new RomanNumeral(1.5)
    }

    @Test
    public void canTransformSeveralNumbersToRomanNumber() {
        assertEquals("I", new RomanNumeral(1).toString())
        assertEquals("II", new RomanNumeral(2).toString())
        assertEquals("III", new RomanNumeral(3).toString())
        assertEquals("IV",new RomanNumeral(4).toString())
        assertEquals("V", new RomanNumeral(5).toString())
        assertEquals("VI", new RomanNumeral(6).toString())
        assertEquals("VII", new RomanNumeral(7).toString())
        assertEquals("VIII", new RomanNumeral(8).toString())
        assertEquals("IX", new RomanNumeral(9).toString())
        assertEquals("X", new RomanNumeral(10).toString())
        assertEquals("XI", new RomanNumeral(11).toString())
        assertEquals("XII", new RomanNumeral(12).toString())
        assertEquals("XIII", new RomanNumeral(13).toString())
    }
}
