class Solution {
    public int characterReplacement(String s, int k) {
        int[] alphabet26 = new int[26];

        int maxFreqChar = 0;
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            int rightChar = s.charAt(right);
            alphabet26[rightChar - 'A']++;

            maxFreqChar = Math.max(maxFreqChar, alphabet26[rightChar-'A']);

            while ((right - left + 1) - maxFreqChar > k) {
                int leftChar = s.charAt(left);
                alphabet26[leftChar - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
