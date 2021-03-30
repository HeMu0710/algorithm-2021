package leetcode.march;

public class T74_search_a_2d_matrix {

    // https://leetcode-cn.com/problems/search-a-2d-matrix/

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i;
        for (i = 0; i < rows; ++i)
            if (matrix[i][0] <= target && matrix[i][cols - 1] >= target) break;
        if (i == rows) return false;
        for (int j = 0; j < cols; ++j) {
            if (matrix[i][j] == target) {
                return true;
            }
        }
        return false;
    }
}
