package github.katas.roman_numerals_kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class RomanNumeralsTest {

    private RomanNumerals romanNumerals = new RomanNumerals();

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

    @Test
    @Parameters({"2, II", //
            "3, III"})
    public void should_return_several_I_when_input_is_lower_than_4(int number,
            String expectedResult) {
        String result = romanNumerals.convert(number);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_IV_when_input_is_4() {
        String result = romanNumerals.convert(4);

        assertThat(result).isEqualTo("IV");
    }
}
