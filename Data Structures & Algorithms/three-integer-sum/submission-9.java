class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> tupleSumSet = new HashSet<>();

        Arrays.sort(nums);        

        for (int i = 0; i < nums.length - 2; i++) {
            int cursorL = i + 1;
            int cursorR = nums.length - 1;
            while (cursorL < cursorR) {
                if (nums[i] + nums[cursorL] + nums[cursorR] < 0) {
                    cursorL++;
                } else if (nums[i] + nums[cursorL] + nums[cursorR] > 0) {
                    cursorR--;
                } else {
                    List<Integer> sortedTuple =
                        new ArrayList<>(Arrays.asList(nums[i], nums[cursorL], nums[cursorR]));
                    tupleSumSet.add(sortedTuple);

                    cursorL++;
                    cursorR--;
                }
            }
        }
        return new ArrayList<>(tupleSumSet);
    }
}
