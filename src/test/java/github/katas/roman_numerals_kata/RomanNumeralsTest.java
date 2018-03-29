package github.katas.roman_numerals_kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();
    @Test
    public void should_return_I_when_input_is_1() {
        String result = romanNumerals.convert(1);

        assertThat(result).isEqualTo("I");
    }

    @Test
    public void should_return_X_when_input_is_10() {
        String result = romanNumerals.convert(10);

        assertThat(result).isEqualTo("X");
    }

    @Test
    public void should_return_V_when_input_is_5() {
        String result = romanNumerals.convert(5);

        assertThat(result).isEqualTo("V");
    }
}
