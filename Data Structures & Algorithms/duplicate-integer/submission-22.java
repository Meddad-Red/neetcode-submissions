class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> find = new HashSet<>();

        for(int num:nums){
            if(find.contains(num)){
                return true;
            }

            find.add(num);
        }

        return false;
    }
}