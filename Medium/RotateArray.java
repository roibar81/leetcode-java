/*
Rotate Array
Description-
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:
	Input: nums = [1,2,3,4,5,6,7], k = 3
	Output: [5,6,7,1,2,3,4]
Explanation:
	rotate 1 steps to the right: [7,1,2,3,4,5,6]
	rotate 2 steps to the right: [6,7,1,2,3,4,5]
	rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:
	Input: nums = [-1,-100,3,99], k = 2
	Output: [3,99,-1,-100]
	Explanation: 
	rotate 1 steps to the right: [99,-1,-100,3]
	rotate 2 steps to the right: [3,99,-1,-100]
 
Constraints:
	1 <= nums.length <= 105
	-231 <= nums[i] <= 231 - 1
	0 <= k <= 105
 
 Follow up:
	Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
	Could you do it in-place with O(1) extra space?
 */
 
 /*There is 3 solutions*/
public void rotate(int[] nums, int k) {
		int tmp = 0;
		int i = 0, j = 0;
        if(nums.length <= 1)
			return;
		if(k % nums.length == 0)
			return;
        k = k % nums.length;
		
//         Solution 1 -- Time Limit Exceeded O(K * Size of array)
        
		// while(j < k) {
		// 	tmp = nums[nums.length - 1];
		// 	for( i = nums.length - 2 ; i >= 0 ; i--)
		// 		nums[i + 1] = nums[i];
		// 	nums[i + 1] = tmp;
		// 	j++;
		// }		
        
//         Solution 2 -- Extra memory
        
		// int[] extramemoryArra = new int[nums.length];
		// for(i = 0, j = nums.length - k ; i < k ; i++) {
		// 	extramemoryArra[i] = nums[j++];
		// }
		// for(i = 0 ; i < nums.length - k ; i++)
		// 	extramemoryArra[i + k] = nums[i];
		// for(i = 0 ; i < nums.length ; i++)
		// nums[i] = extramemoryArra[i];
        
//         Solution 3 - using revers function
        
     	reversIntArrays(nums, 0, nums.length - 1);
		reversIntArrays(nums, 0, k - 1);
		reversIntArrays(nums, k, nums.length - 1);   
        
    }

    private void reversIntArrays(int[] arr, int start, int end) {

		int tmp = 0;
		while(start < end) {
			tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
	}
	
