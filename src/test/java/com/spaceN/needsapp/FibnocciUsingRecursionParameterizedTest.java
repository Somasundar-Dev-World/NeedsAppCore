package com.spaceN.needsapp;


import com.spaceN.needsapp.others.FibnocciUsingRecursion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FibnocciUsingRecursionParameterizedTest {

    private FibnocciUsingRecursion fibnocci;

    private int input;

    private int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][] {
                {0,0},{1,1},{2,1},{3,2},{4,3},{5,5},{6,8},{9,34}
        });
    }

    public FibnocciUsingRecursionParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() throws Exception {
        fibnocci = new FibnocciUsingRecursion();
    }

    @Test
    public void test() {
        Assert.assertEquals(expected,fibnocci.fib(input));
    }
}
