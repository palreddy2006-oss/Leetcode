/*
 * @lc app=leetcode id=2000 lang=java
 *
 * [2000] Reverse Prefix of Word
 */

// @lc code=start
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int start = 0 ; 
        int end = word.indexOf(ch);
        while(start < end ){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
// @lc code=end

