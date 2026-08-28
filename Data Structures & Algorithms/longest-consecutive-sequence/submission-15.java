class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> consecutiveNumSet = new HashSet<>();

        for(int num:nums){
            consecutiveNumSet.add(num);
        }

        int longestLen = 0;

        for(int num: consecutiveNumSet){
            int len=0;
            if(!consecutiveNumSet.contains(num-1)){
                int currentNum = num;
                while(consecutiveNumSet.contains(currentNum)){
                    len++;
                    currentNum++;
                }
            }
            longestLen = Math.max(longestLen,len);
        }
        return longestLen;
    }

    
}
