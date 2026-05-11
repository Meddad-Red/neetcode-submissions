class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Creer Prefix et Suffix (Left and Right)
        //Creer le produit Gauche-vers-Droite
        //Creer le produit Droite-vers-Gauche
        //Multiplier Produit Gauche par Produit Droite
        int size = nums.length;
        int prefix=1, suffix=1;
        
        

        int[] output = new int[size];
        

        for(int i=0; i<size; i++){
            output[i]=prefix;
            prefix*=nums[i];
        }

        for(int i=size-1;i>=0;i--){
            output[i]*=suffix;
            suffix*=nums[i];
        }

        return output;

    }
}  
