package leetcode.january;

public class T1232_check_if_it_is_a_straight_line {

    // https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        float k;
        float b;
        if (coordinates[1][0] != coordinates[0][0]) {
            k = (float) (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
            b = (float) coordinates[0][1] - k * coordinates[0][0];
            for (int i = 2; i < coordinates.length; i++) {
                if (!(Math.abs(coordinates[i][1] - (k * coordinates[i][0] + b)) < 10e-6)) {
                    return false;
                }
            }
        } else {
            int x = coordinates[0][0];
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != x) return false;
            }
        }
        return true;
    }
}
