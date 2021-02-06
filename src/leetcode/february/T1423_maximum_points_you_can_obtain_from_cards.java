package leetcode.february;

import java.util.Arrays;

public class T1423_maximum_points_you_can_obtain_from_cards {

    // https://leetcode-cn.com/problems/maximum-points-you-can-obtain-from-cards/

    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int exn = n - k;
        int total = Arrays.stream(cardPoints).sum();
        int min = 0, sum = 0;
        for (int i = 0; i < exn; i++) {
            sum += cardPoints[i];
        }
        min = sum;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[exn + i];
            sum -= cardPoints[i];
            min = Math.min(min, sum);
        }
        return total - min;
    }
}
