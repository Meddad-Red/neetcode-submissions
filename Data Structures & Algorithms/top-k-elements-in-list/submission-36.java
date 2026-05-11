class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int element:nums){
            freqMap.put(element, (freqMap.getOrDefault(element, 0)+1));
        }

        List<Integer>[] bucketArray = new ArrayList[nums.length+1];
        for(int i=0;i<bucketArray.length;i++){
            bucketArray[i] = new ArrayList<>();
        }

        for(int keyElement : freqMap.keySet()){
            bucketArray[freqMap.get(keyElement)].add(keyElement);
        }

        int index=0;
        int[] result = new int[k];

        for(int i=bucketArray.length-1; i>=0; i--){
            for(int num: bucketArray[i]){
                result[index] = num;
index++;
                if(index==k){
                    return result;
                }

                
            }
        }
        return result;
    }
}
