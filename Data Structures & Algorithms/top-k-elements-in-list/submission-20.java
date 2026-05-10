class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            int numElement = num;
            freqMap.put(numElement, (freqMap.getOrDefault(numElement, 0) + 1));
        }

        List<Integer>[] freqBucket = new ArrayList[nums.length + 1];

        for (int i = 0; i < freqBucket.length; i++) {
            freqBucket[i] = new ArrayList<>();
        }

        for (int value : freqMap.keySet()) {
            int freqValue = freqMap.get(value);
            freqBucket[freqValue].add(value);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = freqBucket.length - 1; i >= 0; i--) {
            for (int element : freqBucket[i]) {
                result[index] = element;
                index++;

                if (index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
