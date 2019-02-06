package com.spaceN.needsapp.others;

public class FibnocciUsingRecursion {


    public int fib(int n) {

        if(n<=1)
            return n;

        return fib(n-1) + fib(n - 2);

    }

   /* public static void main(String args[]) throws Exception {

        FibnocciUsingRecursion fibnocci = new FibnocciUsingRecursion();
        System.out.println(fibnocci.fib(9));
    }*/

}
