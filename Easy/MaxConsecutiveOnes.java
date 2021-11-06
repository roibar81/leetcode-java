/*
Max Consecutive Ones

Description-

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
	Input: nums = [1,1,0,1,1,1]
	Output: 3
	Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:
	Input: nums = [1,0,1,1,0,1]
	Output: 2
 
Constraints:
	1 <= nums.length <= 10^5
	nums[i] is either 0 or 1.
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int lastValChacked = -1;
        int maxSequence = 0;
        int size = nums.length;
        
        if(size == 0)
            return 0;
        
        lastValChacked = nums[0];
        
        if(lastValChacked == 1){
            counter = 1;
            maxSequence = 1;
        }
        for(int i = 1 ; i < size ; i++){
            if(nums[i] == 1 && lastValChacked == 1){
                counter += 1;
                if(maxSequence < counter)
                    maxSequence = counter;
            }
            if(nums[i] == 1 && lastValChacked != 1){
                counter += 1;
                if(maxSequence < counter)
                    maxSequence = counter;
            }
            if(nums[i] !=1 && lastValChacked == 1){
                if(maxSequence < counter)
                    maxSequence = counter;
                counter = 0;
            }
            lastValChacked = nums[i];
        }   
        return maxSequence;
    } 
}