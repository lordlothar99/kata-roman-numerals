package github.katas.roman_numerals_kata;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumeralsTest {

    @Test
    public void should_return_I_when_input_is_1() {
        RomanNumerals romanNumerals = new RomanNumerals();

        String result = romanNumerals.convert(1);

        Assertions.assertThat(result).isEqualTo("I");
    }

}
