/*
Move Zeroes

Description-

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int i = 0;
        int j;
        int tmp;
        
        for(i = 0 ; i < size ; ){
            if(nums[i] == 0){
                tmp = nums[i];
                for(j = i ; j < size -1 ; j++)
                    nums[j] = nums[j+1];
                nums[size-1] = tmp;
                size--;
            }else{
                i++;
            }
        }
    }
}