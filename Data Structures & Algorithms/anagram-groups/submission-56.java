class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {       
        Map<String,List<String>> anaMap = new HashMap<>();

        for(String str:strs){

            int[] alphabet26 = new int[26];
           


            for(int i=0;i<str.length();i++){
                alphabet26[str.charAt(i)-'a']++;
            }            

           

            String key = Arrays.toString(alphabet26);

            if(!anaMap.containsKey(key)){
                List<String> wordString = new ArrayList<>();
                anaMap.put(key,wordString);               
            }

            List<String> wordString = anaMap.get(key);
            wordString.add(str);
            anaMap.put(key,wordString);
        }

        return new ArrayList<>(anaMap.values());


    }
}
