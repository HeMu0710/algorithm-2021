package nowcoder;

public class JZ1 {
    // https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&&tqId=11154&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    // 二维数组中的查找
    public boolean Find(int target, int [][] array) {
        int i = array.length - 1;
        int j = array[0].length - 1;
        do {
            i --;
            j --;
        } while (target < array[i][j]);
        for (int k = 0; k < i + 1; k++) {
            if (array[k][j + 1] == target) return true;
        }
        for (int k = 0; k < j + 1; k++) {
            if (array[i + 1][k] == target) return true;
        }
        return false;
    }
}
