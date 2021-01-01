package leetcode;

public class T605_can_place_flowers {
    // https://leetcode-cn.com/problems/can-place-flowers/

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[1] == 0) {
                        flowerbed[0] = 1;
                        n --;
                    }
                    continue;
                }
                if (i == flowerbed.length - 1) {
                    if (flowerbed[flowerbed.length - 2] == 0) {
                        flowerbed[flowerbed.length - 1] = 1;
                        n --;
                    }
                    continue;
                }
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n --;
                }
            }
        }
        return n <= 0;
    }
}