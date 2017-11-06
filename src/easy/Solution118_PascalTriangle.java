package easy;

import java.util.*;

/**
 * 118. Pascal's Triangle
 Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 * Created by xkc on 8/21/16.
 */
public class Solution118_PascalTriangle {

    public static void main(String[] args){

    }
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list1 = Arrays.asList(1);
        List<Integer> list2 = Arrays.asList(1,1);


        List<List<Integer>> list = new ArrayList<>();
        if (numRows <= 0){
            return list;
        }else {
            list.add(list1);
            if (numRows > 1){
                list.add(list2);
            }

            for (int i = 2;i < numRows; i ++){
                List<Integer> curList = new ArrayList<>(i+1);
                curList.add(1);

                List<Integer> preList = list.get(list.size() - 1);
                for (int j = 0; j < preList.size() - 1; j ++){
                    curList.add(preList.get(j) + preList.get(j + 1));
                }
                curList.add(1);
                list.add(curList);

            }

        }

        return list;

    }
}
