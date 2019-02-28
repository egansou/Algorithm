# Non-overlapping Intervals

Soben's office hours are usually so crowded that he is not able to answer all the questions. To
maximize the number of students who receive their answers, Soben asks each student to write down
one interval on the whiteboard: the time range that they need to talk to him. He then chooses the
maximum number of non-overlapping intervals (two intervals [a, b] and [c, d] overlap if and only if
(c ≤ a ≤ d) ∨ (a ≤ c ≤ b)) and answers the corresponding students. Unfortunately, the process of
choosing the maximum number of non-overlapping intervals is time consuming and wastes a large
fraction of his office hour. Help him write a program that automates this.

## Input
• The first line of the input contains n, the number of intervals (n ≤ 106
). It is then followed
by n lines, each specifying one interval.
• For 1 ≤ i ≤ n, line i + 1 of the input describes the i-th interval. Each interval is described by
two positive integers ai and bi separated by a space (1 ≤ ai ≤ bi ≤ 109
).
## Output
• Print the maximum number of non-overlapping intervals.

## Sample
Sample input:<br>
3<br>
1 10<br>
10 20<br>
20 30<br>
Sample output:<br>
2<br><br>
Sample input:<br>
5<br>
8 10<br>
1 5<br>
2 7<br>
7 9<br>
10 12<br>
Sample output:<br>
3<br>
