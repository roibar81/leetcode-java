/*
Longest Substring Without Repeating Characters

Description- 
 
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
	Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
Example 2:
	Input: s = "bbbbb"
	Output: 1
	Explanation: The answer is "b", with the length of 1.
Example 3:
	Input: s = "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3.
	Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:
	Input: s = ""
	Output: 0
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
		int currentLongest = 0;
		Map<Character , Integer> chackIfAppears = new HashMap<>();
		
		for(int j = 0 ; j < s.length() ; j++) {
			for(int i = j ; i < s.length() ; i++) {
				if(chackIfAppears.containsKey(s.charAt(i))){
					chackIfAppears.clear();
					break;
				}else {
					chackIfAppears.put(s.charAt(i), i);
					currentLongest++;
				}
				if(longest < currentLongest)
					longest = currentLongest;
			}
			currentLongest = 0;
		}
		return longest;
    }
}