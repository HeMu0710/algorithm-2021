# 数据结构与算法练习

题目范围包括leetcode每日一题和剑指Offer的题单

## 刷题记录

### 一月

| 日期      | 题目                                                         | 思路或总结                                                   |
| --------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 2021/1/2  | [leetcode T605 种花问题](https://leetcode-cn.com/problems/can-place-flowers/) | 遍历找连续0，注意几种特殊情况即可                            |
| 2021/1/2  | [leetcode T239 滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/) | 每次滑动，只需比较右端进来的新元素和原有的最大值，倘若新元素更大，那么新元素显而易见成为最大值，反之最大值不变，倘若最大值从左边离开窗口且新元素更小，则要对窗口内元素进行遍历找出最大值 |
| 2021/1/4  | [leetcode T509 斐波那契数列](https://leetcode-cn.com/problems/fibonacci-number/) | 自底向上遍历，比直接递归效率要高                             |
| 2021/1/4  | [leetcode T86 分隔链表](https://leetcode-cn.com/problems/partition-list/submissions/) | 用链表模拟就完事儿了                                         |
| 2021/1/5  | [leetcode T830 较大区间](https://leetcode-cn.com/problems/positions-of-large-groups/) | 转为char数组后遍历计数就完事儿了                             |
| 2021/1/5  | [nowcoder JZ1 二维数组的查找](https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&&tqId=11154&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking) | 根据二维数组本身有序的特性，从左下角开始查找，比target小则往右找，比target大则往上找，超出边界则无target |
| 2021/1/5  | [nowcoder JZ2 替换空格](https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&&tqId=11155&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking) | 转为char数组，遍历                                           |
| 2021/1/5  | [nowcoder JZ3 从尾到头打印链表](https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11155&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking) | 遍历链表，存入list里然后逆序打印                             |
| 2021/1/10 | [leetcode T228 汇总区间](https://leetcode-cn.com/problems/summary-ranges/) | 比较简单的数组操作的题目                                     |
| 2021/1/11 | [leetcode T189 旋转数组](https://leetcode-cn.com/problems/rotate-array/) | 一次性找到对应数组的目标位置即可                             |
| 2021/1/15 | [leetcode T947 移除最多的同行或同列石头](https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/) | 并查集，将石头的y坐标通过+10000操作使其与x坐标隔开，放在一个一维数组上，将每个点加入并查集，最后可以去掉的石头总数就是总石头数减去并查集的连通分量 |
| 2021/1/15 | [leetcode T1202 交换字符串中的元素](https://leetcode-cn.com/problems/smallest-string-with-swaps/) | 并查集+优先队列，多个索引对可能有相连即可以用并查集对可以任意互换的元素归类，并用优先队列保证每次取出的都是最小字典序的字符 |
| 2021/1/15 | [leetcode T1018 可被5整除的2进制前缀](https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/) | 可否被5整除关键是个位数，即可只保留个位数，另外遍历时，可直接将上一次结果乘2后加上当前的位，再模5判断 |
| 2021/1/16 | [leetcode T803 打砖块](https://leetcode-cn.com/problems/bricks-falling-when-hit/) | 并查集+逆向思维，将打砖块看作先将所有要打的全扣掉再一个个填上，计算连通分量的插值，即可得到落下的砖块 |
| 2021/1/17 | [leetcode T1232 缀点连线](https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/) | 通过前两个点算出斜率和截距，往后遍历看是不是符合就完事儿了，斜率无穷大就直接比较x |
| 2021/1/17 | [leetcode T684 冗余连接](https://leetcode-cn.com/problems/redundant-connection/submissions/) | 并查集，倒序遍历所有边，分别计算出除去当前边的其他所有边加入并查集后的连通分量，若为1（即该边为倒序的第一条多余边），则返回这条边 |
| 2021/1/17 | [leetcode T547 省份数量](https://leetcode-cn.com/problems/number-of-provinces/) | 并查集，计算连通分量即可                                     |
| 2021/1/17 | [leetcode T1 两数之和](https://leetcode-cn.com/problems/two-sum/) | 暴力遍历：时间O(N^2),空间O(1)<br>哈希表：时间O(N),空间O(N)   |
| 2021/1/18 | [leetcode T721 账户合并](https://leetcode-cn.com/problems/accounts-merge/) | 并查集+哈希表，通过遍历所有邮箱，将出现过的不重复的邮箱对应id使用并查集去重、合并，最后将之与名字对应 |
| 2021/1/19 | [leetcode T1584 连接所有点的最小费用](https://leetcode-cn.com/problems/min-cost-to-connect-all-points/submissions/) | 最小生成树，最小生成树算法有很多种，各种方法应该都可以，这里采用的是Prim，即每次加入最短的边（相对已连接起来的组件），加完所有点后即得最小生成树 |
| 2021/1/19 | [leetcode T123 买卖股票的最佳时机-Ⅲ](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/submissions/) | 对于任意一天考虑四个变量: <br>fstBuy: 在该天第一次买入股票可获得的最大收益 <br>fstSell: 在该天第一次卖出股票可获得的最大收益 <br>secBuy: 在该天第二次买入股票可获得的最大收益 <br>secSell: 在该天第二次卖出股票可获得的最大收益<br>分别对四个变量进行相应的更新, 最后secSell就是最大 收益值(secSell >= fstSell) |
| 2021/1/19 | [剑指Offer JZ07 重建二叉树](https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/) | 利用递归的方式，通过中序遍历得到根节点后，结合前序遍历计算左子树和右子树的元素个数，分隔开后递归往下构建 |
| 2021/1/20 | [剑指Offer JZ09 用两个栈实现队列](https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/submissions/) | 初始化两个栈：stack1和stack2，新增数据压入stack1中，删除时stack2.pop，倘若stack2为空，就把stack1中所有元素一个个压入stack2，倘若stack1和stack2都为空，返回-1 |
| 2021/1/20 | [剑指Offer JZ10 斐波那契数列(0≤n≤100)](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/submissions/) | 正常斐波那契数列，n可能取特别大导致结果溢出，所以依题意结果要模除1e9+7，即每一步算完后模除即可 |
| 2021/1/20 | [剑指 Offer 10- II. 青蛙跳台阶问题](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/) | F(0) = 1, F(1) = 1,其他同上一道                              |
| 2021/1/20 | [剑指 Offer 11. 旋转数组的最小数字](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/) | 遍历数组，找到第一个比前一个元素小的元素，返回，倘若找不到就属于数组完全递增，返回第一个元素 |
| 2021/1/20 | [628. 三个数的最大乘积](https://leetcode-cn.com/problems/maximum-product-of-three-numbers/) | 排好序后，最大值只可能出现在1、最大的三项乘积 2、最小的两项和最大的一项乘积。知道这一点后返回俩者较大值即可 |
| 2021/1/20 | [剑指 Offer 12. 矩阵中的路径](https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/) | DFS + 剪枝，需要注意回溯时路径的还原和递归的出口             |
| 2021/1/20 | [剑指 Offer 13. 机器人的运动范围](https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/) | DFS K.O                                                      |
| 2021/1/20 | [剑指 Offer 14- I. 剪绳子](https://leetcode-cn.com/problems/jian-sheng-zi-lcof/) | 动态规划，状态转移方程：dp[i] = Math.max(dp[i], Math.max(j * dp[i-j], j * (i - j))); 其中 1<j<ior<br>[数论解法](https://leetcode-cn.com/problems/integer-break/solution/343-zheng-shu-chai-fen-tan-xin-by-jyd/)，将数尽可能拆成最多的3 |
| 2021/1/20 | [剑指 Offer 15. 二进制中1的个数](https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/) | 移位比较<br>n = n & (n - 1) 消去最右边的1，计数              |
| 2021/1/20 | [剑指 Offer 16. 数值的整数次方](https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/) | 快速幂，n往下2分                                             |
| 2021/1/20 | [剑指 Offer 17. 打印从1到最大的n位数](https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/) | 就这？                                                       |
| 2021/1/21 | [1489. 找到最小生成树里的关键边和伪关键边](https://leetcode-cn.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/) | 关键边：去除这条边后，最小生成树权值合变大(v > value)或者无法生成最小生成树<br>伪关键边：首先将这条边连上，最小生成树权值不变(v = value) |
| 2021/1/21 | [剑指 Offer 14- II. 剪绳子 II](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/) | n的范围扩大，且结果要取模导致无法比大小，故直接采用数学方式  |
| 2021/1/21 | [剑指 Offer 18. 删除链表的节点](https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/) | 单链表删除节点                                               |
| 2021/1/22 | [989. 数组形式的整数加法](https://leetcode-cn.com/problems/add-to-array-form-of-integer/) | 模拟正常加法                                                 |
| 2021/1/22 | [剑指 Offer 21. 调整数组顺序使奇数位于偶数前面](https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/) | 双指针从数组两边往中间靠                                     |
| 2021/1/22 | [剑指 Offer 22. 链表中倒数第k个节点](https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/) | 遍历两次，第一次得链表长度，第二次遍历到链表长度 - k 的地方即可 |
| 2021/1/22 | [剑指 Offer 24. 反转链表](https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/) | 双指针                                                       |
| 2021/1/22 | [剑指 Offer 25. 合并两个排序的链表](https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/) | 类似于归并排序                                               |
| 2021/1/22 | [剑指 Offer 26. 树的子结构](https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/) | DFS，需要注意的是DFS的时候只要待匹配的节点为null，直接返回true |
| 2021/1/22 | [剑指 Offer 27. 二叉树的镜像](https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/) | DFS，就这？                                                  |
| 2021/1/22 | [剑指 Offer 28. 对称的二叉树](https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/) | DFS，和上一题类似，只不过判断对称是比较左儿子的左儿子和右儿子的右儿子，左儿子的右儿子和右儿子的左儿子 |
| 2021/1/22 | [剑指 Offer 29. 顺时针打印矩阵](https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/) | 每转一次弯相当于有一条边界向中移了一格                       |
| 2021/1/22 | [剑指 Offer 30. 包含min函数的栈](https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/) | 用数组实现，在push操作时维护更新min，减少排序消耗，只有在pop操作把min弹出后需要重新排序 |
| 2021/1/23 | [1319. 连通网络的操作次数](https://leetcode-cn.com/problems/number-of-operations-to-make-network-connected/) | 并查集，若连接数小于n-1，不可能全部连接，返回 -1。需要更改的连接数就是通过并查集后计算得的连通分量 - 1 （并查集已经比较熟练，可以手写一遍过了 |
| 2021/1/23 | [1248. 统计「优美子数组」](https://leetcode-cn.com/problems/count-number-of-nice-subarrays/) | 前缀和+差分，遍历数组，维护从0到i出现的奇数个数，odd[r] - odd[l - 1] = k即满足条件，故维护一个奇数个数出现的频次数组，每次结果加上前移k项的值即可 |
| 2021/1/23 | [剑指 Offer 31. 栈的压入、弹出序列](https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/) | 模拟入栈出栈操作，最后判断栈是否为空即可                     |
| 2021/1/23 | [剑指 Offer 32 - I. 从上到下打印二叉树](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/) | 二叉树的层序遍历，使用队列实现                               |
| 2021/1/24 | [674. 最长连续递增序列](https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/) | 遍历一遍就ok了                                               |
| 2021/1/24 | [剑指 Offer 32 - II. 从上到下打印二叉树 II](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/) | 递归，记录层数                                               |
| 2021/1/24 | [剑指 Offer 32 - III. 从上到下打印二叉树 III](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/) | 同上一题，奇数行翻转就行了                                   |
| 2021/1/25 | [959. 由斜杠划分区域](https://leetcode-cn.com/problems/regions-cut-by-slashes/) | 并查集 or DFS or BFS                                         |
| 2021/1/26 | [1128. 等价多米诺骨牌对的数量](https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/) | 将二维化作一维然后遍历数组                                   |

