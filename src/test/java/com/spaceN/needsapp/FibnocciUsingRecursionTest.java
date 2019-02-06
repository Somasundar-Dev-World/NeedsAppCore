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
public class FibnocciUsingRecursionTest {

    private FibnocciUsingRecursion fibnocci;

    @Before
    public void setup() throws Exception {
        fibnocci = new FibnocciUsingRecursion();
    }

    @Test
    public void testfib() {
        int result = fibnocci.fib(9);
        Assert.assertEquals(result, 34);
    }

    @Test
    public void testfibWithZero() {
        int result = fibnocci.fib(0);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testfibWithOne() {
        int result = fibnocci.fib(1);
        Assert.assertEquals(result, 1);
    }

}
