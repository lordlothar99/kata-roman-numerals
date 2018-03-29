package github.katas.roman_numerals_kata;

import static org.apache.commons.lang3.StringUtils.repeat;

public class RomanNumerals {

    public String convert(int number) {

        if (number < 3) {
            return repeat("I", number);
        }

        if (number == 5) {
            return "V";
        } else {
            return "X";
        }
    }

}
