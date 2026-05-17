class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Greedy Approach:
        // We can brute force to get the Target by doing a Nesting Loop
        // Or we can see a Mathematic pattern where:
        // target = nums[m] + nums[i];
        // if we Isolate Target we get: nums[m] = target - nums[i]
        // we can give nums[m] a variable name that will be : int complement

        // Create HashMap to manipulate two data : indexes and values of the int array

        // <Key, Value>
        HashMap<Integer,Integer> sumMap = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            // each iteration, we reaavalute the compelement and try to seek in the HashMap
            // according to question scenario, the complement will awalys be positive
            // but we can create Edge Case to make it robust
            int complement = target - nums[i];        

            if(sumMap.containsKey(complement)){
                return new int[]{sumMap.get(complement),i};
            }
            
            sumMap.put(nums[i],i);


        }

        return new int[]{0,0};
    }
}










