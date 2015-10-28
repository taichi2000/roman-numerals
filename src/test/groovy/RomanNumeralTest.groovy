import org.junit.Test
import static org.junit.Assert.assertEquals;

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

    @Test
    public void when4ThenReturnIV() throws Exception {
        assertEquals("IV",new RomanNumeral(4).toString())
    }

    @Test
    public void when5ThenReturnV() throws Exception {
        assertEquals("V", new RomanNumeral(5).toString())
    }

    @Test
    public void when6ThenReturnVI() throws Exception {
        assertEquals("VI", new RomanNumeral(6).toString())
    }

    @Test
    public void when7ThenReturnVII() throws Exception {
        assertEquals("VII", new RomanNumeral(7).toString())
    }

    @Test
    public void when8ThenReturnVIII() throws Exception {
        assertEquals("VIII", new RomanNumeral(8).toString())
    }
}
