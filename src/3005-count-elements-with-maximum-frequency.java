class Solution {
    public int maxFrequencyElements(int[] nums) {
        /*
        1. freq counter of the array, and track the max value
        2. iterate with a filter that filters values as maxVal, out++
        3. return out        
        space: o(n)
        time: o(n)
        */
        Map<Integer,Integer> freqCounter=new HashMap<>();
        int maxValue=0;
        int counter=0;

        for(int num: nums){
            freqCounter.put(num,freqCounter.getOrDefault(num,0)+1);
            maxValue=Math.max(maxValue,freqCounter.get(num));
            
        }
        for(int val: freqCounter.values()){
            if(val==maxValue){
                counter++;
            }
        }
    return counter*maxValue;
    }
}
