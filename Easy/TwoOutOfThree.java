/*
Two Out of Three

Description-

Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 
Example 1:
	Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
	Output: [3,2]
	Explanation: The values that are present in at least two arrays are:
	- 3, in all three arrays.
	- 2, in nums1 and nums2.
Example 2:
	Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
	Output: [2,3,1]
	Explanation: The values that are present in at least two arrays are:
	- 2, in nums2 and nums3.
	- 3, in nums1 and nums2.
	- 1, in nums1 and nums3.
Example 3:
	Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
	Output: []
	Explanation: No value is present in at least two arrays.
 
Constraints:
	1 <= nums1.length, nums2.length, nums3.length <= 100
	1 <= nums1[i], nums2[j], nums3[k] <= 100
*/

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new ArrayList<Integer>();
		int index1 = 0;
		int index2 = 0;
        int index3 = 0;
		
		for(index1 = 0 ; index1 < nums1.length ; index1++) {
			int tmp = nums1[index1];
			index2 = 0;
			index3 = 0;
			while(index2 < nums2.length || index3 < nums3.length) {
				if(index2 < nums2.length && nums2[index2++] == tmp && !res.contains(tmp)) {
					res.add(tmp);
					break;
				}
				if(index3 < nums3.length && nums3[index3++] == tmp && !res.contains(tmp)) {
					res.add(tmp);
					break;
				}
			}
		}
		for(index2 = 0 ; index2 < nums2.length ; index2++) {
			int tmp = nums2[index2];
			for(index3 = 0 ; index3 < nums3.length ; index3++) {
				if(nums3[index3] == tmp && !res.contains(tmp)) {
					res.add(tmp);
					break;
				}
			}
		}
		return res;
    }
}