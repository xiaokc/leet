package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * ugly number
 * Created by xkc on 2/25/16.
 */
public class Solution_263 {
    public static void main(String[] args){
        System.out.println(method(-2147483648));
    }

    //time exceeded
    public static boolean isUgly(int num) {
        int i = 2;
        if (num <= 0){
            return false;
        }
        if (num == 1){
            return true;
        }
        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE){
            return false;
        }
        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0){
            return false;
        }

        List<Integer> list = new ArrayList<>();
        while (num != 1){
            if (num % i == 0){
                list.add(i);
                num /= i;
            }else {
                i ++;
            }
        }

       for (int j = 0; j < list.size(); j ++){
           int tmp = list.get(j);
           if (tmp != 2 && tmp != 3 && tmp != 5){
               return false;
           }
       }
        return false;
    }


    //time exceeded
    public static boolean method(int num){
        int i = 2;
        if (num <= 0){
            return false;
        }
        if (num == 1){
            return true;
        }
        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE){
            return false;
        }
        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0){
            return false;
        }

        while (num != 1){
            if (num % i == 0){
                if (i != 2 && i != 3 && i != 5){
                    return false;
                }
                num /= i;
            }else {
                i ++;
            }
        }

        return true;
    }

    public static boolean simpleMethod(int num){
        if (num > 0) {
            for (int i : new int[]{2, 3, 5}) {
                while (num % i == 0) {
                    num /= i;
                }
            }
        }

        return num == 1;
    }

}
