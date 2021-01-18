# 数据结构与算法练习

题目范围包括leetcode每日一题和剑指Offer的题单

## 刷题记录

| 日期      | 题目                                                         | 思路或总结                                                   |
| --------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 2021/1/15 | [leetcode T947 移除最多的同行或同列石头](https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/) | 并查集，将石头的y坐标通过+10000操作使其与x坐标隔开，放在一个一维数组上，将每个点加入并查集，最后可以去掉的石头总数就是总石头数减去并查集的连通分量 |
| 2021/1/15 | [leetcode T1202 交换字符串中的元素](https://leetcode-cn.com/problems/smallest-string-with-swaps/) | 并查集+优先队列，多个索引对可能有相连即可以用并查集对可以任意互换的元素归类，并用优先队列保证每次取出的都是最小字典序的字符 |
| 2021/1/15 | [leetcode T1018 可被5整除的2进制前缀](https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/) | 可否被5整除关键是个位数，即可只保留个位数，另外遍历时，可直接将上一次结果乘2后加上当前的位，再模5判断 |
| 2021/1/16 | [leetcode T803 打砖块](https://leetcode-cn.com/problems/bricks-falling-when-hit/) | 并查集+逆向思维，将打砖块看作先将所有要打的全扣掉再一个个填上，计算连通分量的插值，即可得到落下的砖块 |
| 2021/1/17 | [leetcode T1232 缀点连线](https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/) | 通过前两个点算出斜率和截距，往后遍历看是不是符合就完事儿了，斜率无穷大就直接比较x |
| 2021/1/17 | [leetcode T684 冗余连接](https://leetcode-cn.com/problems/redundant-connection/submissions/) | 并查集，倒序遍历所有边，分别计算出除去当前边的其他所有边加入并查集后的连通分量，若为1（即该边为倒序的第一条多余边），则返回这条边 |
| 2021/1/17 | [leetcode T547 省份数量](https://leetcode-cn.com/problems/number-of-provinces/) | 并查集，计算连通分量即可                                     |
| 2021/1/17 | [leetcode T1 两数之和](https://leetcode-cn.com/problems/two-sum/) | 暴力遍历：时间O(N^2),空间O(1)；哈希表：时间O(N),空间O(N)     |
| 2021/1/18 | [leetcode T721 账户合并](https://leetcode-cn.com/problems/accounts-merge/) | 并查集+哈希表，通过遍历所有邮箱，将出现过的不重复的邮箱对应id使用并查集去重、合并，最后将之与名字对应 |

## commit格式

每日一题 or 正常刷题

```text
yy/dd ...
```

补做之前的每日一题

```text
yy/dd fix yy/dd ...
```

刷题记录