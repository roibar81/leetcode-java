/*
Reverse Words in a String III

Description-

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
	Input: s = "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:
	Input: s = "God Ding"
	Output: "doG gniD"
 
Constraints:
	1 <= s.length <= 5 * 104
	s contains printable ASCII characters.
	s does not contain any leading or trailing spaces.
	There is at least one word in s.
All the words in s are separated by a single space.
 */
 
 /*There is 4 solutions*/
public String reverseWords(String s) {
		int end = 0, start = 0;
		String res = "";
	    for( end = 0 ; end < s.length() ; end++){
	        if(Character.isWhitespace(s.charAt(end))){
	        	res += reverseTokenInString(s.substring(end - start, end));
	        	start = 0;
	        }else if(end == s.length() - 1) {
	        	res += reverseTokenInString(s.substring(end - start));
	        }
	        start++;
	    }
	    return res;
	}
	    
	public String reverseTokenInString(String s){
		char[] in = s.toCharArray();
	    int begin = 0;
	    int end = in.length - 1;
	    char temp;
	    while(end > begin){
	    	if(in[begin] == ' ') {
	        	begin++;
	        }else {
		        temp = in[begin];
		        in[begin] = in[end];
		        in[end] = temp;
		        end--;
		        begin++;
	    	}
	    }
	    return new String(in);
	}
	