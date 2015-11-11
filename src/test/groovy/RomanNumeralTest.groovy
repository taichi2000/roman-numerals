import org.junit.Test
import static org.junit.Assert.assertEquals;

//based on http://romannumerals.babuo.com/roman-numerals-1-5000
class RomanNumeralTest {

    @Test(expected = GroovyRuntimeException.class)
    public void shouldNotAcceptBigDecimalInConstructor()  {
        new RomanNumeral(1.5)
    }

    @Test
    public void canTransformSeveralNumbersToRomanNumber() {
        assertRomanNumeral("I",1)
        assertRomanNumeral("II",2)
        assertRomanNumeral("III",3)
        assertRomanNumeral("IV",4)
        assertRomanNumeral("V",5)
        assertRomanNumeral("VI",6)
        assertRomanNumeral("VII",7)
        assertRomanNumeral("VIII",8)
        assertRomanNumeral("IX",9)
        assertRomanNumeral("X",10)
        assertRomanNumeral("XI",11)
        assertRomanNumeral("XII",12)
        assertRomanNumeral("XIII",13)
        assertRomanNumeral("XIV",14)
        assertRomanNumeral("XV",15)
        assertRomanNumeral("XVI",16)
        assertRomanNumeral("XVII",17)
        assertRomanNumeral("XVIII",18)
        assertRomanNumeral("XIX",19)
        assertRomanNumeral("XX",20)
        assertRomanNumeral("XXI",21)
        assertRomanNumeral("XXII",22)
        assertRomanNumeral("XXXIX",39)
        assertRomanNumeral("XL",40)
        assertRomanNumeral("XLI",41)
        assertRomanNumeral("XLII",42)
        assertRomanNumeral("XLIII",43)
        assertRomanNumeral("XLIX",49)

    }

    def assertRomanNumeral(String expectedRomanNumeral, int number) {
        assertEquals(expectedRomanNumeral, new RomanNumeral(number).toString())
    }
}
