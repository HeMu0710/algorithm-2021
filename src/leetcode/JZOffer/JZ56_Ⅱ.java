package leetcode.JZOffer;

public class JZ56_Ⅱ {

    // https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/comments/

    // 解法参考：https://www.cnblogs.com/MyStringIsNotNull/p/12585218.html

    public int singleNumber(int[] nums) {
        int a = 0,b =0;
        for(int i:nums){
            b = ~a&(b^i);
            a = ~b&(a^i);
        }
        return b;
    }
}
