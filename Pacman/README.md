#  Pac-Man
You are in control of Pac-Man, and Soben challenges you to catch a Power Pellet (the larger dots
that are located in the corners of the maze). With a broken Joystick with which you can only
move up and right, this seems to be very difficult as there is only one Power Pellet that you can
potentially catch (the one in the upper-right corner). Before accepting the challenge, you want to
write a program to see in how many distinct ways (if any) the Power Pellet can be reached.
The game board is a grid and Pac-Man moves discretely on the nodes of the grid as shown
below. Using the cartesian coordinate system, a pair of integers is assigned to each node. The
Pac-Man’s initial location is (0, 0) and the Power Pellet is located at (w, h). Some of the nodes
of the grid are blocked, i.e., the Pac-Man cannot pass through these nodes. Your program should
report the number of distinct paths from (0, 0) to (w, h) that do not pass through any blocked
nodes.

![alt text](https://github.com/egansou/Algorithm/blob/master/Pacman/Pac%20Man.png)

## Input
• The first line of the input contains integers w and h (1 ≤ w, h ≤ 100).
• The second line of the input contains n, the number of blocks. (0 ≤ n ≤ w · h)
• The next n lines, each contain two integers ai and bi
, representing the position of the blocks.
(0 ≤ ai ≤ w, 0 ≤ bi ≤ h)
## Output
• Print one number: the number of distinct ways that the Pac-Man can reach the Power Pellet
mod 1016 (i.e., if there are more than 1016 distinct paths to reach the Power Pellet, you only
print the 16 least significant digits of the solution).
## Sample
Sample input:<br>
5 3 <br>
6<br>
1 2<br>
2 2<br>
2 3<br>
3 1<br>
3 2<br>
3 3<br>
Sample output:<br>
4<br><br>
Sample input:<br>
100 100 <br>
1<br>
50 50<br>
Sample output:<br> 
2540614329311784<br>
