class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>hm=new HashMap<>();
        //iterate and sort each word, 
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            //check if the word is present in the hashmap, a key of a pair
            if(hm.size()>0 && hm.containsKey(sortedStr)){
            //if yes append to the value list of that key, size==
                List<String> ls=hm.get(sortedStr);
                ls.add(str);
                hm.put(sortedStr,ls);
            }
            //if no, create a new list and a key value pair in the hashmap, size +1 
            else{
                List<String> newLs=new ArrayList<>();
                newLs.add(str);
                hm.put(sortedStr,newLs);
            }
        }
        List<List<String>> groups=new ArrayList<>();
        for(List<String> group: hm.values()){
            groups.add(group);
        }
        return groups;
        //space- o(n) and time is o(n*mlogm) n for iterating each word and mlogm for sorting each word
    }
}
