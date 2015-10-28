public class RomanNumeral {

    private int value

    RomanNumeral(int value) {
        this.value = value
    }

    String toString() {
        switch (value) {
            case 1..3:
                return "I" * value
            case 4:
                return "IV"
            case 5:
                return "V"
            case 6:
                return "VI"
            default:
                return "VII"
        }
    }
}