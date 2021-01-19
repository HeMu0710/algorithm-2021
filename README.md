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
| 2021/1/17 | [leetcode T1 两数之和](https://leetcode-cn.com/problems/two-sum/) | 暴力遍历：时间O(N^2),空间O(1)；哈希表：时间O(N),空间O(N)     |
| 2021/1/18 | [leetcode T721 账户合并](https://leetcode-cn.com/problems/accounts-merge/) | 并查集+哈希表，通过遍历所有邮箱，将出现过的不重复的邮箱对应id使用并查集去重、合并，最后将之与名字对应 |
| 2021/1/19 | [leetcode T1584 连接所有点的最小费用](https://leetcode-cn.com/problems/min-cost-to-connect-all-points/submissions/) | 最小生成树，最小生成树算法有很多种，各种方法应该都可以，这里采用的是Prim，即每次加入最短的边（相对已连接起来的组件），加完所有点后即得最小生成树 |
| 2021/1/19 | [leetcode T123 买卖股票的最佳时机-Ⅲ](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/submissions/) | 对于任意一天考虑四个变量: fstBuy: 在该天第一次买入股票可获得的最大收益 fstSell: 在该天第一次卖出股票可获得的最大收益 secBuy: 在该天第二次买入股票可获得的最大收益 secSell: 在该天第二次卖出股票可获得的最大收益 分别对四个变量进行相应的更新, 最后secSell就是最大 收益值(secSell >= fstSell) |
| 2021/1/19 | [剑指Offer JZ07 重建二叉树](https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/) | 利用递归的方式，通过中序遍历得到根节点后，结合前序遍历计算左子树和右子树的元素个数，分隔开后递归往下构建 |
| 2021/1/20 | [剑指Offer JZ09](https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/submissions/) | 初始化两个栈：stack1和stack2，新增数据压入stack1中，删除时stack2.pop，倘若stack2为空，就把stack1中所有元素一个个压入stack2，倘若stack1和stack2都为空，返回-1 |

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