/*
Sum of Square Numbers

Description-

Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

Example 1:
	Input: c = 5
	Output: true
	Explanation: 1 * 1 + 2 * 2 = 5
Example 2:
	Input: c = 3
	Output: false
Example 3:
	Input: c = 4
	Output: true
Example 4:
	Input: c = 2
	Output: true
Example 5:
	Input: c = 1
	Output: true
 
Constraints:
	0 <= c <= 2^31 - 1
*/

class Solution {
    public boolean judgeSquareSum(int c) {
    for (long a = 0; a * a <= c / 2; a++) {
        
        double b = Math.sqrt(c - a * a);

        if (b == (int) b)
            return true;
        }
        return false;
    }
}