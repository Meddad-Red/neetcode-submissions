class Solution {
    public int longestConsecutive(int[] nums) {
        //on commence a delete les duplicate
        HashSet<Integer> numSet = new HashSet<>();

        for(int num:nums){
            numSet.add(num);
        }

        int longestSeq = 0;

        for(int num:numSet){

            if(!numSet.contains(num-1)){
                int currentNum=num;
                int currentSeq=1;

                 while(numSet.contains(currentNum+1)){
                currentNum++;
                currentSeq++;
                }
                longestSeq = Math.max(longestSeq,currentSeq);
            }

           

            
        }
        return longestSeq;
    }
}
