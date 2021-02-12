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

## 归档

- [一月归档](https://github.com/HeMu0710/algorithm-2021/tree/master/src/leetcode/january)

PS：刷题记录每月归档一次，具体记录在对应月份文件夹内