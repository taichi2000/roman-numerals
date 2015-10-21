import org.junit.Test

import static junit.framework.Assert.assertEquals

class RomanNumeralTest {

    @Test
    public void canTransformOneToRomanNumber() {
        assertEquals("I", new RomanNumeral(1).toString())

    }

    @Test(expected = GroovyRuntimeException.class)
    public void shouldNotAcceptBigDecimalInConstructor()  {
        new RomanNumeral(1.5)
    }

    @Test
    public void when2ThenReturnII() {
        assertEquals("II", new RomanNumeral(2).toString())
    }

    @Test
    public void when3ThenReturnIII() {
        assertEquals("III", new RomanNumeral(3).toString())
    }
}
