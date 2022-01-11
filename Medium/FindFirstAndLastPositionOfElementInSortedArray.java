/*
Find First and Last Position of Element in Sorted Array
Description-
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
	Input: nums = [5,7,7,8,8,10], target = 8
	Output: [3,4]
Example 2:
	Input: nums = [5,7,7,8,8,10], target = 6
	Output: [-1,-1]
Example 3:
	Input: nums = [], target = 0
	Output: [-1,-1]
 
Constraints:
	0 <= nums.length <= 105
	-109 <= nums[i] <= 109
	nums is a non-decreasing array.
	-109 <= target <= 109
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)
            return new int[] {-1,-1};
        int i = 0, j = 0;
        for(i = 0 ; i < nums.length ; i++){
            if(nums[i] > target)
                break;
            if(nums[i] == target)
                break;
        }
        if(i < nums.length && nums[i] == target){
            for(j = i + 1; j < nums.length ; j++){
                if(nums[j] > target)
                    break;
            }
            return new int[] {i, j - 1};
        }else
            return new int[] {-1, -1};
    }
}