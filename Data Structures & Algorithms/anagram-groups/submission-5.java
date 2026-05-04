class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> stringAnagrams = new HashMap<>();
        List<List<String>> anagrams = new ArrayList<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = Arrays.toString(chars);
            if(stringAnagrams.containsKey(sortedString)){
                stringAnagrams.get(sortedString).add(str);
            }else{
                List<String> stringList = new ArrayList<>();
                stringList.add(str);
                stringAnagrams.put(sortedString, stringList);
            }
        }
        // anagrams.add(stringAnagrams.values());
        return new ArrayList<>(stringAnagrams.values());

        
    }
}
