class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word: strs){
            int[] alphabet26 = new int[26];

            for(char c: word.toCharArray()){
                alphabet26[c-'a']++;
            }

            String key = Arrays.toString(alphabet26);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        
        return new ArrayList<>(map.values());

    }
}
