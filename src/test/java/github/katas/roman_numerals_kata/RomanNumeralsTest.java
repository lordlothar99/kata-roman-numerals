package github.katas.roman_numerals_kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void should_return_I_for_1() {
        String result = romanNumerals.convert(1);

        assertThat(result).isEqualTo("I");
    }

}
