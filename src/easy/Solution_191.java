package easy;

/**
 * Created by xkc on 2/24/16.
 * Number of 1 bits
 * Tips:
 * >>>逻辑右移或叫无符号右移运算符只对位进行操作，没有算术含义，它用0填充左侧的空位。
 * >>算术右移运算符，它使用最高位填充移位后左侧的空位
 */
public class Solution_191 {
    public static void main(String[] args){
        System.out.print(hammingWeight(11));
    }
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0){
            count += (n & 1);
            n = n >>> 1;
        }
        return count;

    }


}
