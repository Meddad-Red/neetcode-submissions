class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prodL = new int[nums.length];
        Arrays.fill(prodL,1);

        for(int left=0; left<nums.length-1;left++){
            prodL[left+1] = prodL[left]*nums[left];
        }

        int[] prodR = new int[nums.length];
        Arrays.fill(prodR,1);

        for(int right=nums.length-1; right>0;right--){
            prodR[right-1] = prodR[right]*nums[right];
        }

        for(int i=0;i<nums.length;i++){
            prodR[i]*=prodL[i];
        }

        return prodR;

    }
}  
