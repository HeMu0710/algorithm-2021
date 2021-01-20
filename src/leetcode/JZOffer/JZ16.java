package leetcode.JZOffer;

public class JZ16 {

    // https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/

    public double myPow(double x, int n) {
        if (n == 0 || x == 1.0) return 1;
        if (n < 0) {
            x = 1 / x;
            if (n == -2147483648) {
                n = -1 * (n + 1);
                return pow(x, n) * x;
            } else {
                n *= -1;
            }
        }
        return pow(x, Math.abs(n));
    }

    public double pow(double x, int n) {
        // must n > 0
        if (n == 1) return x;
        double dx;
        if (n % 2 == 0) {
            dx = pow(x, n / 2);
            return dx * dx;
        }
        else {
            dx = pow(x, n / 2);
            return dx * dx * x;
        }
    }

    public static void main(String[] args) {
        JZ16 solution = new JZ16();
        System.out.println(solution.myPow(2.0, -2147483648));
    }
}
