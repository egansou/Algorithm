# Expression Tree
An expression tree is a rooted tree where the leaves of the tree are operands (constant numbers)
and the other nodes are the operators (for this problem, either “×” or “+”). An expression tree is
evaluated by applying the operator at the root to the values obtained by recursively evaluating its
children. For example the tree in the figure below corresponds to expression<br>
sum(sum(3, 10, 7), product(5, 10), 4) = sum(20, 50, 4) = 74

![alt text](https://github.com/egansou/Algorithm/blob/master/Expression%20Tree/Tree.png)

Assume that sum(x) = product(x) = x, i.e., if there is only one operand, by applying some or
product operators, we get the same number. Given an expression tree in the input, evaluate it and
print its output mod 1016

## Input
• The first line of the input contains n, the number of nodes in the tree (1 ≤ n ≤ 105).
• The second line contains n strings where the ith string denotes the operator/operand of the
ith node. This means each string is either “*”, “+”, or an integer x (1 ≤ x ≤ 10). Assume that the first node is the root of the tree.
• The next n − 1 lines describe the edges of the tree. Each line contains two integers i and j
(1 ≤ i, j ≤ n) denoting that the ith node is connected to the jth node.

## Output
• Print the solution of the tree expression mod 1016

## Sample
Sample input:<br>
7 <br>
* 10 + * 10 10 10<br>
1 3<br>
3 2<br>
5 3<br>
1 4<br>
4 7<br>
4 6<br>
4<br>
Sample output:<br>
2000<br>
