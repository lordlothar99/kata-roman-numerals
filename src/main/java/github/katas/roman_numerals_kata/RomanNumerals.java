package github.katas.roman_numerals_kata;

public class RomanNumerals {

    public String convert(int number) {
        if (number == 1) {
            return "I";
        } else {
            return "X";
        }
    }

}
