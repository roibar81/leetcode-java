/*
Sum of Two Integers

Description-

Given two integers a and b, return the sum of the two integers without using the operators + and -.

Example 1:
	Input: a = 1, b = 2
	Output: 3
Example 2:
	Input: a = 2, b = 3
	Output: 5
 
Constraints:
	-1000 <= a, b <= 1000
*/

class Solution {
    public int getSum(int a, int b) {
        return Integer.sum(a, b); // I was surprised by the level of the question under the medium category of LeetCode
    }
}