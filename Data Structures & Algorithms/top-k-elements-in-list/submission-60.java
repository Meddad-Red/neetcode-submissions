class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> freqBucket = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            while (freqBucket.size() <= freq) {
                freqBucket.add(new ArrayList<>());
            }

            freqBucket.get(freq).add(key);
        }

        int kIndex = 0;
        int[] resultArr = new int[k];

        for (int i = freqBucket.size() - 1; i >= 0 && kIndex < k; i--) {
            if (i < freqBucket.size() && !freqBucket.get(i).isEmpty()) {
                for (int num : freqBucket.get(i)) {
                    resultArr[kIndex] = num;

                    if (kIndex == k) {
                        break;
                    }

                    kIndex++;
                }
            }
        }

        return resultArr;
    }
}
