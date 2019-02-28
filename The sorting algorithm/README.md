# The sorting algorithm

Soben, a young algorithm designer, has came up with a sorting algorithm that takes exactly
ba · n ln(n) + bc nanoseconds to sort an array of n numbers (a and b are constant numbers and
the logarithm is natural, i.e., it is in base e). He is now interested to find the size of the largest
array that can be sorted using his algorithm in t nanoseconds. More precisely, for a given time t
nanoseconds, Soben wants to find the maximum number n such that ba · n log(n) + bc ≤ t. Help
him find this number.

## Input
• The first line of input contains constant a (1 ≤ a ≤ 10).
• The second line of input contains constant b (0 ≤ b ≤ 106
).
• The third line of each scenario, contains the time t (1 ≤ t ≤ 1016).

## Output
• Print the maximum number of elements that can be sorted in time t

## Sample

Sample input:
1
0
1000
Sample output: 190

Sample input             Sample output
10                        79711685664
55
20008973878324
