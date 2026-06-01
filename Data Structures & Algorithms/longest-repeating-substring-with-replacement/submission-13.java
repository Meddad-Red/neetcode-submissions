class Solution {
    public int characterReplacement(String s, int k) {
        int[] alphabet26 = new int[26];
        int maxCount = 0;
        int charCount = 0;
        int maxSize = 0;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            int rightChar = s.charAt(right);
            alphabet26[rightChar - 'A']++;
            maxCount = Math.max(maxCount, alphabet26[rightChar - 'A']);

            

            while ((right-left+1) - maxCount > k) {
                int leftChar = s.charAt(left);

                alphabet26[leftChar-'A']--;
                left++;
            }

            maxSize = Math.max(maxSize, (right-left+1));
        }

        return maxSize;
    }
}
