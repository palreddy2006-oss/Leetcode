class Solution {
    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            if (!vowels.contains(chars[start]+"")) {
                start++;
            }
            else if (!vowels.contains(chars[end]+"")) {
                end--;
            }

            else if (vowels.contains(chars[start]+"") && vowels.contains(chars[end]+"")) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }else{
                start++;
                end--;
            }
        }
        return new String(chars);
    }
   
}