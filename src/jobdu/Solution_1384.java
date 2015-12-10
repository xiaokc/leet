package jobdu;

import java.util.Scanner;

//jobdu上提交java代码，主类名必须是Main
/**
 *Runtime Error
 * Created by xkc on 9/1/15.
 */
public class Solution_1384 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int t = scanner.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Please input the arr:");
        for(int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The arr is:");
        for(int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



       if(method(arr,t)) {
           System.out.println("Yes");
       }else {
           System.out.println("No");
       }


    }

    private static boolean method(int[][] arr, int t){
        for(int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j ++){
                if (arr[i][j] == t){
                    return true;
                }
            }
        }

        return false;
    }


}
