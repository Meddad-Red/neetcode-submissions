class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> noDuplicate = new HashSet<>();

        for(int num : nums){
            if(noDuplicate.contains(num)){
                return true;
            }

            noDuplicate.add(num);
        }
        
        return false;
    }
}