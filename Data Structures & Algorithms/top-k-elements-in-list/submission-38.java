class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freqBucket = (ArrayList<Integer>[]) new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freqBucket[freq] == null) {
                freqBucket[freq] = new ArrayList<>();
            }

            freqBucket[freq].add(num);
        }

        int resultIndex = 0;
        int[] freqResultArr = new int[k];

        for (int i = freqBucket.length - 1; i >= 0 && resultIndex < k; i--) {
            if (freqBucket[i] != null) {
                for (int num : freqBucket[i]) {
                    freqResultArr[resultIndex] = num;
                    resultIndex++;

                    if (resultIndex == k) {
                        break;
                    }
                }
            }
        }

        return freqResultArr;
    }
}
