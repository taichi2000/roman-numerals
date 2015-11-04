public class RomanNumeral {

    private int value

    RomanNumeral(int value) {
        this.value = value
    }

    String toString() {
        String units = ""

        def mod = value % 10

        switch (mod) {
            case 1..3:
                units = "I" * mod
                break
            case 4:
                units = "IV"
                break
            case 5..8:
                units = "V" + "I" * (mod - 5)
                break
            case 9:
                units = "IX"
                break
        }

        return value < 40 ? "X" * (value / 10 ) + units : "XL"
    }
}