package easy;

/**
 * ZigZag Conversion
 * Created by xkc on 2/25/16.
 */
public class Solution6_ZigZag {
    public static void main(String[] args){
        System.out.println(convert("PAYPALISHIRING",4));
    }

    public static String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < sb.length; i ++){
            sb[i] = new StringBuilder();
        }

        int i = 0;
        while (i < len){
            for (int idx = 0; idx < numRows && i < len; idx ++){
                sb[idx].append(chars[i++]);
            }
            for (int idx = numRows - 2; idx >= 1 && i < len; idx --){
                sb[idx].append(chars[i ++]);
            }
        }

        for (int idx = 1; idx < sb.length; idx ++){
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }
}
