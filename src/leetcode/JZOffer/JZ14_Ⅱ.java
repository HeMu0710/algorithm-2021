package leetcode.JZOffer;

public class JZ14_Ⅱ {

    // https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/

    public int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        long res = 1;
        while(n > 4){
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }
}
