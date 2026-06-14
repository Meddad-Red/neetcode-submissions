class Solution {
    public String minWindow(String s, String t) {
        if (s == null || s.length() < t.length())
            return "";

        int[] targetFreq = new int[128];
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        int requiredChars = t.length();

        while (right < s.length()) {
            char rChar = s.charAt(right);

            if (targetFreq[rChar] > 0) {
                requiredChars--;
            }

            targetFreq[rChar]--;

            while (requiredChars == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char lChar = s.charAt(left);
                targetFreq[lChar]++;
                if (targetFreq[lChar] > 0) {
                    requiredChars++;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
