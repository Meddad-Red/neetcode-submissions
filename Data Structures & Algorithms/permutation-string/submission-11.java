class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] windowAlphabet = new int[26];
        int[] alphabet26 = new int[26];

        int s1Len = s1.length();

        for (int i = 0; i < s1.length(); i++) {
            windowAlphabet[s1.charAt(i) - 'a']++;
            alphabet26[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(windowAlphabet, alphabet26)) {
            return true;
        }

        for (int right = s1Len; right < s2.length(); right++) {
            int current = s2.charAt(right);
            alphabet26[current - 'a']++;

            int left = right - s1Len;
            alphabet26[s2.charAt(left) - 'a']--;

            if (Arrays.equals(windowAlphabet, alphabet26)) {
                return true;
            }
        }

        return false;
    }
}
