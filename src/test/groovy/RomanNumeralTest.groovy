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
        assertRomanNumeral("L",50)
        assertRomanNumeral("LI",51)
        assertRomanNumeral("LII",52)
        assertRomanNumeral("LIII",53)
        assertRomanNumeral("LIV",54)
        assertRomanNumeral("LV",55)
        assertRomanNumeral("LVI",56)
        assertRomanNumeral("LVII",57)
        assertRomanNumeral("LVIII",58)
        assertRomanNumeral("LIX",59)
        assertRomanNumeral("LX",60)
        assertRomanNumeral("LXX",70)
        assertRomanNumeral("LXXX",80)
        assertRomanNumeral("XC",90)
        assertRomanNumeral("XCI",91)
        assertRomanNumeral("XCII",92)
        assertRomanNumeral("XCIII",93)
        assertRomanNumeral("XCIV",94)
        assertRomanNumeral("XCV",95)
        assertRomanNumeral("XCVI",96)
        assertRomanNumeral("XCVII",97)
        assertRomanNumeral("XCVIII",98)
        assertRomanNumeral("XCIX",99)
        assertRomanNumeral("C",100)
        assertRomanNumeral("CI",101)
        assertRomanNumeral("CDXCIX",499)
        assertRomanNumeral("D",500)
        assertRomanNumeral("DI",501)
        assertRomanNumeral("DCC",700)
        assertRomanNumeral("CMXCIX",999)
        assertRomanNumeral("MMMMMMMMMM",10000)
        assertRomanNumeral("MMMMMMMMMMMMMMMMMMMCMXCIX",19999)
        assertRomanNumeral("MMMMMMMMMMMMMMMMMMMM",20000)
        assertRomanNumeral("MMMMMMMMMMMMMMMMMMMMI",20001)
    }

    def assertRomanNumeral(String expectedRomanNumeral, int number) {
        def romanNumeral = new RomanNumeral(number).toString()

        println "${number}: ${romanNumeral}"

        assertEquals(expectedRomanNumeral, romanNumeral)
    }
}
