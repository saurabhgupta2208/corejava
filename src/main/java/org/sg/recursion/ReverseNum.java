package org.sg.recursion;

// 1324 --> 4231
public class ReverseNum {

    static int reverseNum = 0;

    static void main() {
        reverse(1324);
        System.out.println(reverseNum);
        int[] reverseNumArr = new int[1];
        reverseWithClassVariable(1324,reverseNumArr);
        System.out.println(reverseNumArr[0]);
        System.out.println(reverse1(1324));
    }

    static int reverse1(int num){
        int noOfDigit = Integer.toString(num).length();
        return helper(num, noOfDigit-1);
    }

    private static int helper(int num, int noOfDigit) {
        if(num%10 == num)
            return num;
        int rem = num%10;
        return rem*(int)Math.pow(10, noOfDigit) + helper(num/10, --noOfDigit);
    }

    static void reverse(int num){
        if(num == 0)
            return;
        int reminder = num % 10;
        reverseNum = reverseNum*10 + reminder;
        reverse(num/10);

    }
    static void reverseWithClassVariable(int num, int reverse[]){
        if(num == 0)
            return;
        int reminder = num % 10;
        reverse[0] = reverse[0]*10 + reminder;
        reverseWithClassVariable(num/10, reverse);

    }
}
