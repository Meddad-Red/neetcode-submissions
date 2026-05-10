class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anaMap = new HashMap<>();

        for(String word: strs){
            int[] alphabet26 = new int[26];

            for(char c: word.toCharArray()){
                alphabet26[c-'a']++;
            }

            String key = Arrays.toString(alphabet26);

            if(!anaMap.containsKey(key)){
                anaMap.put(key, new ArrayList<>());
            }

            anaMap.get(key).add(word);
        }

        return new ArrayList<>(anaMap.values());
    }
}
