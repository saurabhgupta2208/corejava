package org.sg.recursion;

// 1234 -> 10
public class SumOfN {
    static void main() {
        System.out.println(sum(1324));
    }

    static int sum(int n){
        if(n == 0)
            return 0;
        int rem = n % 10;
        return rem + sum(n/10);

    }
}
