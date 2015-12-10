package medium;

/**
 * NO. 151 Reverse Words in a String
 * 将字符串逆序输出，如the sky is blue，输出blue is sky the
 * Created by xkc on 7/25/15.
 */
public class Solution_151 {
    public static void main(String[] args) {
        String string = reverseWords_2("  a  b");
        System.out.print(string);
    }

    public static String reverseWords(String s) {
        s = s.trim();//删除字符串两端多余的空格

        String result = "";
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != " " && !arr[i].isEmpty()) {//此处注意new String、null和""的区别
                if (result == "") {
                    result = arr[i];
                } else {
                    result = result + " " + arr[i];
                }
            }

        }
        return result;
    }

    public static String reverseWords_2(String s) {
        s = s.trim();
        String result = "";
        String[] arr = s.split(" +");//多个连续空格切割
        for(int i = arr.length - 1; i >= 0; i --){
            if (result == ""){
                result = arr[i];
            }else {
                result = result + " " + arr[i];
            }
        }
        return result;
    }


}
