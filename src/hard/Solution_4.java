package hard;

/**
 * 两个有序数组的中位数
 * Created by xkc on 12/4/15.
 */
public class Solution_4 {

    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length;
//        int l = (m + n + 1) / 2;
//        int r = (m + n + 2) / 2;
//        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;


        if ((m + n) % 2 != 0) {
            return findKth(A, 0, m - 1, B, 0, n - 1, (m + n) / 2);
        } else {
            return (findKth(A, 0, m - 1, B, 0, n - 1, (m + n) / 2)
                    + findKth(A, 0, m - 1, B, 0, n - 1, (m + n) / 2 - 1)) / 2;
        }

    }

    public static double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart > A.length - 1) return B[bStart + k - 1];
        if (bStart > B.length - 1) return A[aStart + k - 1];
        if (k == 1) return Math.min(A[aStart], B[bStart]);

        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if (aStart + k / 2 - 1 < A.length) aMid = A[aStart + k / 2 - 1];
        if (bStart + k / 2 - 1 < B.length) bMid = B[bStart + k / 2 - 1];

        if (aMid < bMid)
            return getkth(A, aStart + k / 2, B, bStart, k - k / 2);// Check: aRight + bLeft
        else
            return getkth(A, aStart, B, bStart + k / 2, k - k / 2);// Check: bRight + aLeft
    }

    /**
     * AC
     * @param A
     * @param aStart
     * @param aEnd
     * @param B
     * @param bStart
     * @param bEnd
     * @param k
     * @return
     */
    public static double findKth(int[] A, int aStart, int aEnd, int[] B, int bStart, int bEnd, int k) {
        int aLen = aEnd - aStart + 1;
        int bLen = bEnd - bStart + 1;
        if (aLen == 0) {
            return B[bStart + k];
        }
        if (bLen == 0) {
            return A[aStart + k];
        }
        if (k == 0) {
            return Math.min(A[aStart], B[bStart]);
        }

        int aMid = aLen * k / (aLen + bLen);
        int bMid = k - aMid - 1;

        aMid = aMid + aStart;
        bMid = bMid + bStart;

        if (A[aMid] > B[bMid]) {
            k = k - (bMid - bStart + 1);
            aEnd = aMid;
            bStart = bMid + 1;

        } else {
            k = k - (aMid - aStart + 1);
            bEnd = bMid;
            aStart = aMid + 1;
        }

        return findKth(A, aStart, aEnd, B, bStart, bEnd, k);

    }

}
