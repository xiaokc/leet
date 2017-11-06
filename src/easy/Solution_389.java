package easy;

/**
 * Created by xkc on 8/29/16.
 */
public class Solution_389 {
    public static void main(String[] args){
//        int[] ints = change(new char[]{'a','b'});
//        for (int i:ints){
//            System.out.println(i);
//        }
        System.out.println(findTheDifference_better("abcd","abcde"));

    }
    public static char findTheDifference(String s, String t) {
        int[] sint = change(s.toCharArray());
        int[] tint = change(t.toCharArray());

        int ssum = sum(sint);
        int tsum = sum(tint);
        return (char) (tsum - ssum + 'a');
    }

    public static int[] change(char[] s){
        int len = s.length;
        int[] ints = new int[len];
        for (int i = 0; i < len; i ++){
            ints[i] = s[i] - 'a';
        }
        return ints;
    }

    public static int sum(int[] ints){
        int len = ints.length;
        int sum = 0;
        for (int i = 0; i < len; i ++){
            sum += ints[i];
        }
        return sum;
    }

    public static char findTheDifference_better(String s, String t){
        char c = 0;
        for (int i = 0; i < s.length(); i ++){
            c ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i ++){
            c ^= t.charAt(i);
        }

        return c;
    }
}
