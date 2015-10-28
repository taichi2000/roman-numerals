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
            case 5..8:
                return "V" + "I" * (value - 5)
            case 9:
                return "IX"
            default:
                return "X" + "I" * (value - 10)
        }
    }
}