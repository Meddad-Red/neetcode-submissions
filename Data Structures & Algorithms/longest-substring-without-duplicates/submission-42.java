class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int n = s.length();

        Set<Character> charSet = new HashSet<>(n);
        Queue<Character> charQueue = new ArrayDeque<>(n);

        int longestSubString = 0;
        int sizeWduplicate = 0;
        int sizeNoDuplicate = 0;

        for (int i = 0; i < n; i++) {
            Character currentChar = s.charAt(i);

            if (charSet.contains(currentChar)) {
                Character removed;

                if (!charQueue.isEmpty() && charQueue.peek() == currentChar) {
                    charQueue.poll();
                    charQueue.add(currentChar);
                } else {
                    while ((removed = charQueue.poll()) != null && removed != currentChar) {
                        charSet.remove(removed);
                    }

                    if (currentChar == removed) {
                        charSet.add(removed);
                        charQueue.add(removed);
                    }
                }

                sizeWduplicate = charQueue.size();
                System.out.println(sizeWduplicate);

            } else {
                charSet.add(currentChar);
                charQueue.add(currentChar);
                sizeNoDuplicate = charQueue.size();
                System.out.println(sizeNoDuplicate);
            }

            longestSubString =
                Math.max(longestSubString, Math.max(sizeWduplicate, sizeNoDuplicate));
        }

        return longestSubString;
    }
}