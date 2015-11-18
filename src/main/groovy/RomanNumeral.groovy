public class RomanNumeral {

    private int value

    RomanNumeral(int value) {
        this.value = value
    }

    String toString() {
        getUnidadDeMil() + getCentenas() + getDecenas() + getRomanUnits();
    }

    String getUnidadDeMil() {
        def miles = (int) (value/ 1000)

        "M" * miles
    }

    String getCentenas() {
        def centenas = (int) ((value % 1000) / 100)

        switch (centenas) {
            case 0:
                ""
                break
            case 1..3:
                "C" * centenas
                break
            case 4:
                "CD"
                break
            case 5..8:
                "D" + "C" * (centenas - 5)
                break
            case 9:
                "CM"
                break
            default:
                "ERROR"
        }
    }

    String getDecenas() {
        def tens = (int) ((value % 100) / 10)

        switch (tens) {
            case 0:
                ""
                break
            case 1..3:
                "X" * tens
                break
            case 4:
                "XL"
                break
            case 5..8:
                "L" + "X" * (tens - 5)
                break
            case 9:
                "XC"
                break
            default:
                "ERROR"
        }
    }

    String getRomanUnits() {
        def remainingDigits = value % 10

        switch (remainingDigits) {
            case 1..3:
                "I" * remainingDigits
                break
            case 4:
                "IV"
                break
            case 5..8:
                "V" + "I" * (remainingDigits - 5)
                break
            case 9:
                "IX"
                break
            default:
                ""
        }
    }
}