/*
Median of Two Sorted Arrays

Description- 
 
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:
	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.
Example 2:
	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:
	Input: nums1 = [0,0], nums2 = [0,0]
	Output: 0.00000
Example 4:
	Input: nums1 = [], nums2 = [1]
	Output: 1.00000
Example 5:
	Input: nums1 = [2], nums2 = []
	Output: 2.00000
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] medArr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        double res = 0;
        while(k < medArr.length && i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                medArr[k++] = nums1[i++];
            }else{
                medArr[k++] = nums2[j++];
            }
        }
        if(i < nums1.length){
            for( ; i < nums1.length ; i++)
                medArr[k++] = nums1[i];
        }else if(j < nums2.length){
            for( ; j < nums2.length ; j++)
                medArr[k++] = nums2[j];
        }
        
        if(medArr.length % 2 ==0) {
        	res = (double) (medArr[(medArr.length / 2) - 1] + medArr[(medArr.length / 2)]) / 2;
        }else {
        	res = (double) medArr[(medArr.length / 2)];
        }
		return res;
    }
}