package nowcoder;

public class JZ1 {
    // https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&&tqId=11154&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    // 二维数组中的查找
    /**
     * 暴力查找，竟然也能过？？？
    public boolean Find(int target, int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (target == array[i][j]) return true;
            }
        }
        return false;
    }
    */

    public boolean Find(int target, int [][] array) {
        if (array.length == 0) return false;
        if (array[0].length == 0) return false;
        int jSize = array[0].length - 1;
        int iSize = array.length - 1;
        if (target < array[0][0] || target > array[iSize][jSize]) return false;
        for (int i = 0; i <= iSize; i++) {
            if (target == array[i][0] || target == array[i][jSize]) return true;
            if (target > array[i][jSize]) continue;
            for (int j = 0; j < jSize; j++) {
                if (target == array[0][j] || target == array[iSize][j]) return true;
                if (target > array[iSize][j]) continue;
                if (target == array[i][j]) return true;
            }
        }
        return false;
    }

}
