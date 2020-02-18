package com.program;

import static java.lang.String.valueOf;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String THREE = "3";
    private static final String FIVE = "5";
    private final int start;
    private final int end;

    public FizzBuzz(final int start, final int end) {
        this.start = start;
        this.end = end;
    }

    public List<String> printNumber() {
        final List<String> result = new ArrayList<String>();

        for (int i = start; i <= end; i++) {
            if ((i % 3 == 0 || valueOf(i).contains(THREE)) && ( i % 5 == 0 || valueOf(i).contains(FIVE))) {
                result.add(FIZZ_BUZZ);
            } else if (i % 3 == 0 || valueOf(i).contains(THREE)) {
                result.add(FIZZ);
            } else if (i % 5 == 0 || valueOf(i).contains(FIVE)) {
                result.add(BUZZ);
            } else {
                result.add(valueOf(i));
            }
        }

        return result;
    }
}
