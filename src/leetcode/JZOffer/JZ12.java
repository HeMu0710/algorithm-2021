package leetcode.JZOffer;

import java.util.Arrays;

public class JZ12 {

    // https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (find(board, word, 0, i, j)) return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, String word, int index, int x, int y) {
        if (index == word.length()) return true;
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != word.charAt(index)) return false;
        board[x][y] = '\0';
        boolean ans = find(board, word, index + 1, x + 1, y) ||
                find(board, word, index + 1, x - 1, y) ||
                find(board, word, index + 1, x, y + 1) ||
                find(board, word, index + 1, x, y - 1);
        board[x][y] = word.charAt(index);
        return ans;
    }

    public static void main(String[] args) {
        JZ12 solution = new JZ12();
        char[][] board = new char[3][4];
        for (char[] cc: board) {
            Arrays.fill(cc, 'a');
        }
        System.out.println(solution.exist(board, "aaaaaaaaaaaaa"));
    }
}
