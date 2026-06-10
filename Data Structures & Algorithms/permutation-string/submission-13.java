class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] alphabet26 = new int[26];
        int[] windowSize = new int[26];

        int s1Len = s1.length();        

        for (int i = 0; i < s1Len; i++) {
            windowSize[s1.charAt(i) - 'a']++;
            alphabet26[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(windowSize, alphabet26)) {
            return true;
        }

        for (int right = s1Len; right < s2.length(); right++) {
            alphabet26[s2.charAt(right) - 'a']++;

           
            int left = right - s1Len;
            alphabet26[s2.charAt(left) - 'a']--;

            if (Arrays.equals(windowSize, alphabet26)) {
                return true;
            }
        }

        return false;
    }
}
