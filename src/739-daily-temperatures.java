class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] out=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
int prevDay=0;
        for(int currDay=0;currDay<temperatures.length;currDay++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[currDay]){
                prevDay=stack.pop();
                out[prevDay]=currDay-prevDay;
            }
            stack.push(currDay);   
    }
    return out;
}
}

#Appraoch
build decreasing monotonoic stack meaning stack smaller numbers as you go up.
the reason being when a warmer day occurs below colder days affect.
