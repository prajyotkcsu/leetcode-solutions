class Solution {
    Map<Character,Integer> freqCount=new HashMap<>();
    int kele=2;
    public int longestSubstring(String s, int k) {
        int maxLength=0;
        String input="1011001";
        int left=0,right=0;
        char[] charArray=s.toCharArray();
        while(right<s.length()){
            addToMap(charArray[right]);
            if(isFreqCounterValid()){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
        }
    return maxLength;}
    void addToMap(char c){
        freqCount.put(Character.valueOf(c),freqCount.getOrDefault(Character.valueOf(c),0)+1);
    }
    boolean isFreqCounterValid(){
        if(freqCount.size()==kele && arePairs()){
            return true;
        }
        return false;
    }
    boolean arePairs(){
        for(int v:freqCount.values()){
            if(v<2){
                return false;
            }
        }
        return true;
    }
}
