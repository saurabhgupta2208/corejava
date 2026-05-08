package org.sg.recursion;

//10304 --> 2
public class CountZero {
    static void main() {
        System.out.println(countZero(103005, 0));
    }

    static int countZero(int n, int count){
        if(n == 0)
            return count;
        if(n%10==0)
            return countZero(n/10, count +1);
        else
            return countZero(n/10,count);
    }
}
