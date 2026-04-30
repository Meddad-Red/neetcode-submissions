class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twoIndex = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            int difference = target - nums[i];

            if(twoIndex.containsKey(difference)){
                return new int[] {twoIndex.get(difference),i};
            }

            twoIndex.put(nums[i],i);
        }
        return new int[] {};
    }
    
}
