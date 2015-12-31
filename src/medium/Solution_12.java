package medium;

/**
 * 将阿拉伯数字转为罗马数字
 * Created by xkc on 12/31/15.
 */
public class Solution_12 {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] ints = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < ints.length; i++) {
            while (num >= ints[i]) {
                sb.append(strs[i]);
                num -= ints[i];
            }
        }

        return sb.toString();

    }


    //discuss copy here. :)
    public enum Type{
        M(1000),CM(900),D(500),CD(400),C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);
        private final int value;
        Type(int value) {
            this.value = value;
        }
    };

    public static String intToRoman2(int num){
        StringBuilder output = new StringBuilder();
        for (Type t:Type.values()) {
            while (num>=t.value) {
                output.append(t);
                num -= t.value;
            }
        }
        return output.toString();
    }




}
