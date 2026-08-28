class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> consecutiveIntSet = new HashSet<>();

        for(int num:nums){
            consecutiveIntSet.add(num);
        }

        int maxLen=0;

        for(int num: consecutiveIntSet){
            int len=0;

            if(!consecutiveIntSet.contains(num-1)){
                int currentNum=num;
                while(consecutiveIntSet.contains(currentNum)){
                    len++;
                    currentNum++;
                }
            }
            maxLen = Math.max(maxLen,len);
        }

        return maxLen;
        
    }
}
