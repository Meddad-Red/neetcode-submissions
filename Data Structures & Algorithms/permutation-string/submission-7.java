class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            return true;
        }

        int[] alphabetS1 = new int[26];
        int[] windowS2 = new int[26];
        int s1Len = s1.length();

        for (int i = 0; i < s1Len; i++) {
            alphabetS1[s1.charAt(i) - 'a']++;
            windowS2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(alphabetS1, windowS2)) {
            return true;
        }

        for (int right = s1Len; right < s2.length(); right++) {
            windowS2[s2.charAt(right) - 'a']++;

            windowS2[s2.charAt(right - s1Len) - 'a']--;

            if (Arrays.equals(alphabetS1, windowS2)) {
                return true;
            }
        }

        return false;
    }
}
