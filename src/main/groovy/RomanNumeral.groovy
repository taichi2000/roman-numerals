public class RomanNumeral {

    private int value

    RomanNumeral(int value) {
        this.value = value
    }

    String toString() {
        if (value < 4)
            return "I" * value
        else if (value == 4)
            return "IV"
        else if (value == 5)
            return "V"
        else if (value == 6)
            return "VI"
        else return "VII"
    }
}