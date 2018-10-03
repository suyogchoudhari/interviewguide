package org.interviewguide.recursion;

public class NthFibonacciNumber {

    public int nthFibonacciNumber(int n)
    {
        //base condition
        if(n == 0 || n == 1)
            return n;

        return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }

    public static void main(String[] args) {
        NthFibonacciNumber object = new NthFibonacciNumber();
        System.out.println("5th fibonacci number: " + object.nthFibonacciNumber(5));
        System.out.println("5th fibonacci number: " + object.nthFibonacciNumber(6));
    }
}
