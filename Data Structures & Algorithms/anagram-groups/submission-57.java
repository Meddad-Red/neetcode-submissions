class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anaGroupMap = new HashMap<>();

        for(String str : strs){
            int[] alphabet26 = new int[26];

            for(int i=0; i<str.length(); i++){
                alphabet26[str.charAt(i)-'a']++;
            }

            String keyString = Arrays.toString(alphabet26);

            if(!anaGroupMap.containsKey(keyString)){
                List stringList = new ArrayList<>();
                anaGroupMap.put(keyString, stringList);
            }

            
            List stringList = anaGroupMap.get(keyString);
            stringList.add(str);

            anaGroupMap.put(keyString,stringList);           
            
        }

        return new ArrayList<>(anaGroupMap.values());

    }
}
