class Solution {
    public int removeElement(int[] nums, int val) {                       
        int k=0;
        if(nums.length==1 && nums[0]==val){
            return k;
        }       
        
        for(int i=0; i<nums.length; i++){           
            if(nums[i]!=val){  
                nums[k]=nums[i];
                k++;             
            }     
           
        }
        return k;
    }
}