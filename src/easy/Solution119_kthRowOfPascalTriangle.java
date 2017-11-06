package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 119. Pascal's Triangle II  QuestionEditorial Solution  My Submissions
 Total Accepted: 86200
 Total Submissions: 255921
 Difficulty: Easy
 Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].


 * Created by xkc on 8/25/16.
 */
public class Solution119_kthRowOfPascalTriangle {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> curList = new ArrayList<>();
        if (rowIndex < 0) {
            return curList;
        } else if (rowIndex == 0) {
            return Arrays.asList(1);
        } else if (rowIndex == 1) {
            return Arrays.asList(1,1);
        } else {
            List<Integer> preList = getRow(rowIndex - 1);
            curList.add(1);
            for (int i = 0; i < preList.size() - 1; i++) {
                curList.add(preList.get(i) + preList.get(i + 1));
            }
            curList.add(1);

            return curList;
        }
    }
}
