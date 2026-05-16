class Solution {
    public int trap(int[] height) {
        int left = 0;
        int totalWater = 0;

        while (left < height.length - 1) {
            int right = left + 1;

            // Search for a right wall that is at least as high as left wall
            while (right < height.length && height[right] < height[left]) {
                right++;
            }

            // If we did not find a wall >= left wall,
            // choose the highest wall on the right side
            if (right == height.length) {
                int maxRight = left + 1;

                for (int i = left + 2; i < height.length; i++) {
                    if (height[i] > height[maxRight]) {
                        maxRight = i;
                    }
                }

                // If even the best right wall is 0, no more water is possible
                if (height[maxRight] == 0) {
                    break;
                }

                right = maxRight;
            }

            int minHeight = Math.min(height[left], height[right]);

            // Calculate water between left and right
            for (int i = left + 1; i < right; i++) {
                totalWater += Math.max(0, minHeight - height[i]);
            }

            // Move left wall to the right wall
            left = right;
        }

        return totalWater;
    }
}