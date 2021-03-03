package leetcode.march;

public class T338_counting_bits {

    // https://leetcode-cn.com/problems/counting-bits/

    public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        int hignBit = 0;
        for (int i = 1; i <= num; ++i) {
            if ((i & (i - 1)) == 0) {
                hignBit = i;
            }
            bits[i] = bits[i - hignBit] + 1;
        }
        return bits;
    }
}
