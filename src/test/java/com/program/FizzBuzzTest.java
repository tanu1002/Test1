package com.program;



import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private FizzBuzz fizzBuzz = new FizzBuzz(1,100);

    @Test
    public void testShouldBeAbleToPrintNumber(){
        final List<String> result = fizzBuzz.printNumber();
        assertThat(result.get(0), is("1"));
        assertThat(result.get(97), is("98"));
    }


    @Test
    public void testShouldBeAbleToPrintFizzForMultiplesOfThree(){
        final List<String> result = fizzBuzz.printNumber();
        assertThat(result.get(2), is(FIZZ));
        assertThat(result.get(5), is(FIZZ));
        assertThat(result.get(8), is(FIZZ));
        assertThat(result.get(11), is(FIZZ));
    }

    @Test
    public void testShouldBeAbleToPrintBuzzForMultiplesOfFive(){
        final List<String> result = fizzBuzz.printNumber();
        assertThat(result.get(4), is(BUZZ));
        assertThat(result.get(9), is(BUZZ));
        assertThat(result.get(19), is(BUZZ));
        assertThat(result.get(24), is(BUZZ));
    }


    @Test
    public void testShouldBeAbleToPrintFizzBuzzForMultiplesOfThreeAndFive(){
        final List<String> result = fizzBuzz.printNumber();
        assertThat(result.get(14), is(FIZZ_BUZZ));
        assertThat(result.get(29), is(FIZZ_BUZZ));
        assertThat(result.get(44), is(FIZZ_BUZZ));
        assertThat(result.get(59), is(FIZZ_BUZZ));
    }


    @Test
    public void testShouldBeAbleToPrintFizzIfHasThreeInIt(){
        final List<String> result = fizzBuzz.printNumber();
        assertThat(result.get(2), is(FIZZ));
        assertThat(result.get(12), is(FIZZ));
        assertThat(result.get(22), is(FIZZ));
    }

    @Test
    public void testShouldBeAbleToPrintBuzzIfHasFiveInIt(){
        final List<String> result = fizzBuzz.printNumber();
        assertThat(result.get(4), is(BUZZ));
        assertThat(result.get(24), is(BUZZ));
        assertThat(result.get(51), is(BUZZ));
        assertThat(result.get(55), is(BUZZ));
        assertThat(result.get(54), is(BUZZ));
        assertThat(result.get(49), is(BUZZ));
    }

    @Test
    public void testShouldBeAbleToPrintFizzBuzzIfMultiplesOfThreeOrHasThreeAndMultiplesOfFiveOrHasFive(){
        final List<String> result = fizzBuzz.printNumber();
        assertThat(result.get(34), is(FIZZ_BUZZ));
        assertThat(result.get(50), is(FIZZ_BUZZ));
        assertThat(result.get(52), is(FIZZ_BUZZ));
        assertThat(result.get(53), is(FIZZ_BUZZ));
        assertThat(result.get(56), is(FIZZ_BUZZ));
    }

}
