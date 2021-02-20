# 数据结构与算法练习

题目范围包括leetcode每日一题和剑指Offer的题单

## 刷题记录

| 日期      | 题目                                                         | 思路或总结                                                   |
| --------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 2021/2/1  | [888. 公平的糖果棒交换](https://leetcode-cn.com/problems/fair-candy-swap/) | 使用hashset加速查找过程                                      |
| 2021/2/2  | [424. 替换后的最长重复字符](https://leetcode-cn.com/problems/longest-repeating-character-replacement/) | 双指针+滑动窗口                                              |
| 2021/2/3  | [480. 滑动窗口中位数](https://leetcode-cn.com/problems/sliding-window-median/) | 自建满足题意地数据结构，双堆维护+延迟删除                    |
| 2021/2/4  | [643. 子数组最大平均数 I](https://leetcode-cn.com/problems/maximum-average-subarray-i/) | 简单滑动窗口                                                 |
| 2021/2/5  | [1208. 尽可能使字符串相等](https://leetcode-cn.com/problems/get-equal-substrings-within-budget/) | 双指针                                                       |
| 2021/2/6  | [1423. 可获得的最大点数](https://leetcode-cn.com/problems/maximum-points-you-can-obtain-from-cards/) | 找出n-k长度的最小合连续子串，其余就是合最大子串              |
| 2021/2/7  | [665. 非递减数列](https://leetcode-cn.com/problems/non-decreasing-array/) | 消除相邻递减的时候需要分情况考虑怎么消除                     |
| 2021/2/8  | [162. 寻找峰值](https://leetcode-cn.com/problems/find-peak-element/) | 二分递归，根据nums[i]和nums[i+1]确定往左递归还是往右         |
| 2021/2/8  | [978. 最长湍流子数组](https://leetcode-cn.com/problems/longest-turbulent-subarray/) | 滑动窗口                                                     |
| 2021/2/9  | [992. K 个不同整数的子数组](https://leetcode-cn.com/problems/subarrays-with-k-different-integers/) | 「最多存在 `K`个不同整数的子区间的个数」与「最多存在 `K-1` 个不同整数的子区间的个数」的差恰好等于「恰好存在 `K`个不同整数的子区间的个数」 |
| 2021/2/10 | [567. 字符串的排列](https://leetcode-cn.com/problems/permutation-in-string/) | 滑动窗口                                                     |
| 2021/2/11 | [703. 数据流中的第 K 大元素](https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/) | 维护一个固定长度的优先队列，保证队列首一直是第K大的元素      |
| 2021/2/12 | [119. 杨辉三角 II](https://leetcode-cn.com/problems/pascals-triangle-ii/) | 注意反向遍历                                                 |
| 2021/2/13 | [448. 找到所有数组中消失的数字](https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/) | 原地修改，最后遍历找出结果                                   |
| 2021/2/13 | [剑指 Offer 33. 二叉搜索树的后序遍历序列](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/) | 递归解决                                                     |
| 2021/2/14 | [765. 情侣牵手](https://leetcode-cn.com/problems/couples-holding-hands/) | 并查集，对每对座位上的俩个人按情侣对数序号进行合并操作，最后对数 - 连通分量即是结果 |
| 2021/2/15 | [485. 最大连续1的个数](https://leetcode-cn.com/problems/max-consecutive-ones/) | 数组遍历                                                     |
| 2021/2/16 | [561. 数组拆分 I](https://leetcode-cn.com/problems/array-partition-i/) | 从小到大排完序后，从零往后取偶数下标的数之和即是答案         |
| 2021/2/16 | [剑指 Offer 34. 二叉树中和为某一值的路径](https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/) | DFS+回溯                                                     |
| 2021/2/17 | [566. 重塑矩阵](https://leetcode-cn.com/problems/reshape-the-matrix/) | 数组遍历，注意下标的转换                                     |
| 2021/2/18 | [995. K 连续位的最小翻转次数](https://leetcode-cn.com/problems/minimum-number-of-k-consecutive-bit-flips/) | 差分数组或者滑动窗口优化                                     |
| 2021/2/19 | [1004. 最大连续1的个数 III](https://leetcode-cn.com/problems/max-consecutive-ones-iii/) | 滑动窗口，找到最大长度，含0个数不超过K的连续子数组           |
| 2021/2/19 | [剑指 Offer 35. 复杂链表的复制](https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/) | 深拷贝，哈希表或者拼接裁剪                                   |
| 2021/2/19 | [剑指 Offer 36. 二叉搜索树与双向链表](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/) | 中序遍历dfs                                                  |
| 2021/2/19 | [剑指 Offer 37. 序列化二叉树](https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/) | 层序遍历，包含二叉树完整信息                                 |
| 2021/2/19 | [剑指 Offer 38. 字符串的排列](https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/) | DFS+剪枝                                                     |
| 2021/2/20 | [剑指 Offer 39. 数组中出现次数超过一半的数字](https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/) | 摩尔投票法                                                   |
| 2021/2/20 | [697. 数组的度](https://leetcode-cn.com/problems/degree-of-an-array/) | 遍历，保存每个数字出现次数、第一次出现和最后一次出现         |

## 归档

- [一月归档](https://github.com/HeMu0710/algorithm-2021/tree/master/src/leetcode/january)

PS：刷题记录每月归档一次，具体记录在对应月份文件夹内
