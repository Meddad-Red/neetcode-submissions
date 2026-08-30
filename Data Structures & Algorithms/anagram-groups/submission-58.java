class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();

        for(String str:strs){
            int[] alphabet26 = new int[26];

            for(int i=0;i<str.length();i++){
                alphabet26[str.charAt(i)-'a']++;
            }

            String anaKey = Arrays.toString(alphabet26);

            if(!strMap.containsKey(anaKey)){                
                strMap.put(anaKey,new ArrayList<>());
            }
            strMap.get(anaKey).add(str);
        }

        return new ArrayList<>(strMap.values());
    }
}
