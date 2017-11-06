package easy;

/**NO. 8 String to Integer (atoi)
 * 1、null or empty
 * 2、write spaces
 * 3、+/- sign
 * 4、calculate the real value
 * 5、Max_value/Min_value
 *
 * Created by xkc on 7/25/15.
 */
public class Solution8_atoi {
    public static void main(String[] args){
        //int num = myAtoi("+-2");
        int num = method("-+1");
        System.out.print("num="+num);
    }

    //wrong answer input:+-2 output:2 expected:0
    public static int myAtoi(String str) {
        //null or empty
        if (str == null || str.length() < 1){
            return 0;
        }

        //write spaces
        str = str.trim();

        //handle +/- sign eg:input "-+1" output: -1
        char flag = '+';
        int i = 0;
        while(str.charAt(i) == '+' || str.charAt(i) == '-'){
            i ++;
        }
        if (str.charAt(0) == '-'){
            flag = '-';
        }

        //calculate the real value
        double result = 0;
        while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            result = result * 10 + (str.charAt(i) - '0');
            i ++;
        }
        if (flag == '-'){
            result = -result;
        }

        if (result > Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }

        return (int) result;
    }


    //终于ac了
    public static int method(String str){
        if (str == null || str.length() < 1){
            return 0;
        }

        str = str.trim();

        double result = 0;
        char sign = '+';
        int i = 0;
        if (str.charAt(0) == '+'){
            i ++;
        }
        if(str.charAt(0) == '-'){
            i ++;
            sign = '-';
        }

        for(int j = i; j < str.length(); j++){
            if (str.charAt(j) >= '0' && str.charAt(j) <= '9'){
                result = result * 10 + (str.charAt(j) - '0');
            }else {
                break;
            }
        }
        if (sign == '-'){
            result = -result;
        }
        if (result > Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }

        return (int) result;
    }


    public static int method_2(String str){
        str = str.trim();

        double result = 0;

        return (int)result;
    }

}
