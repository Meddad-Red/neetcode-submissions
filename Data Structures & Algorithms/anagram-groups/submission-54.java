class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anaGroup = new HashMap<>();

        for(String word: strs){

            int[] count26 = new int[26];

            for(char c: word.toCharArray()){
                count26[c-'a']++;                
            }

            String key = Arrays.toString(count26);

            if(!anaGroup.containsKey(key)){
                anaGroup.put(key,new ArrayList<>());
            }

            anaGroup.get(key).add(word);
        }

        return new ArrayList<>(anaGroup.values());
    }
}
