package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xkc on 2/25/16.
 * Happy Number
 */
public class Solution202_HappyNumber {
    public static void main(String[] args){
        System.out.println((method(2)));
    }
    //超时
    public static boolean isHappy(int n) {
        while (n != 1){
            List<Integer> list = new ArrayList<>();
            while (n != 0){
                list.add(n % 10);
                n /= 10;
            }
            for (int i = 0; i < list.size(); i ++) {
                n += Math.pow(list.get(i),2);
            }
        }
        return true;
    }

    public static boolean method(int n){
        int x  = n;
        int y = n;

        while (x > 1){
            x = cal(x);
            if (x == 1){
                return true;
            }

            y = cal(cal(y));
            if (y == 1){
                return true;
            }
            if (x == y){
                return false;
            }
        }


        return true;
    }

    public static int cal(int n){
        int sum = 0;
        while (n != 0){
            sum += (n % 10) * (n % 10);
            n /= 10;
        }

        return sum;
    }

}
