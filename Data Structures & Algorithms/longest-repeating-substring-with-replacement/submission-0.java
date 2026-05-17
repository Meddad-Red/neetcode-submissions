class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() == 1) {
            return 1;
        }

        int[] alphabet26 = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            
            char currentChar = s.charAt(right);
            alphabet26[currentChar - 'A']++;
            
            maxCount = Math.max(maxCount, alphabet26[currentChar - 'A']);

            while ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                alphabet26[leftChar - 'A']--;
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
