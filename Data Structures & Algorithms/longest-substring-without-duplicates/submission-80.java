class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int[] asciiTable = new int[128];        

        int left = 0;
        int maxLen = 1;

        for (int right = 0; right < s.length(); right++) {
            asciiTable[s.charAt(right)]++;
            
            while(left<right && asciiTable[s.charAt(right)]>1){                
                asciiTable[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }

        return maxLen;
    }
}
