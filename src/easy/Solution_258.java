package easy;

import java.util.Scanner;

/**
 * Add Digits
 * Created by xkc on 9/25/15.
 */
public class Solution_258 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = addDigits(num);
        System.out.print("num=" + num + ",n=" + n);
    }

    public static int addDigits(int num) {

//        return (num - 1) % 9 + 1;

        if (num < 10){
            return num;
        }

        int t = 0;
        while(num >= 1){
            t += num % 10;
            num /= 10;
        }

        return addDigits(t);

    }
}
