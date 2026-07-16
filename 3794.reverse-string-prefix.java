/*
 * @lc app=leetcode id=3794 lang=java
 *
 * [3794] Reverse String Prefix
 */

// @lc code=start
class Solution {
    public String reversePrefix(String s, int k) {
         String str = s;
         char[] arr = str.toCharArray();

        int start = 0;
        int end = k - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        

        
        return str = new String(arr);
    }
}
// @lc code=end

