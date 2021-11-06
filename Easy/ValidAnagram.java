/*
Valid Anagram

Description-

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
	Input: s = "anagram", t = "nagaram"
	Output: true
Example 2:
	Input: s = "rat", t = "car"
	Output: false
 
Constraints:
	1 <= s.length, t.length <= 5 * 10^4
	s and t consist of lowercase English letters.
 
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] countArr = new int[26];
        int size = 26;
        char character;
        int ascii = 0;
        
        for(int i = 0 ; i < size ; i++){
            countArr[i] = 0;
        }
        for(int i = 0 ; i < s.length() ; i++){
            character = s.charAt(i); 
            ascii = (int) character;
            countArr[ascii - 97]++;
        }
        for(int i = 0 ; i < t.length() ; i++){
            character = t.charAt(i); 
            ascii = (int) character;
            countArr[ascii - 97]--;
        }
        for(int i = 0 ; i < size ; i++){
            if(countArr[i] != 0)
                return false;
        }
        return true;
    }
}