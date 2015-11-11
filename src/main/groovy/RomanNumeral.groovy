public class RomanNumeral {

    private int value

    RomanNumeral(int value) {
        this.value = value
    }

    String toString() {
        String units = getRomanUnits()

        def tens = "X" * (value / 10)
        def lessThanForty = tens + units

        def morethanForty = "XL" + units

        value < 40 ? lessThanForty : (value == 40) ? "XL" : morethanForty
    }

    String getRomanUnits (){
        def remainingDigits = value % 10

        def units = ""
        switch (remainingDigits) {
            case 1..3:
                units = "I" * remainingDigits
                break
            case 4:
                units = "IV"
                break
            case 5..8:
                units = "V" + "I" * (remainingDigits - 5)
                break
            case 9:
                units = "IX"
                break
        }

        return units
    }
}