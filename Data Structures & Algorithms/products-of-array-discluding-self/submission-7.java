class Solution {
    public int[] productExceptSelf(int[] nums) {
        int preProd=1, sufProd=1;
        int len = nums.length;
        int[] result = new int[len];
        Arrays.fill(result,1);

        for(int i=0;i<len;i++){
            int rightC = len-1-i;

            result[i]*=preProd;
            preProd*=nums[i];

            result[rightC]*=sufProd;
            sufProd*=nums[rightC];

        }



        return result;
        
    }
}  
