class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] out=new int[temperatures.length];
        //create a stack
        Stack<int[]> stack=new Stack<>();
//70  ....71
        //iterate and if stack is empty or currentTemp is lesser than the peek() temp, push() temps along with their index in the stack.
        for(int currDay=0;currDay<temperatures.length;currDay++){
            //until you find a warmer day you push days in the stack
            while(!stack.isEmpty() && stack.peek()[0]<temperatures[currDay]){
                int colderDay=stack.pop()[1]; //pop the colder day and get it's index
                out[colderDay]=currDay-colderDay; //updating the difference between warmer and colder day.
            }
            stack.push(new int[]{temperatures[currDay],currDay});
        }
        //pop() currentTemp index-popped temp index-> answer for the popped temp index in the output


        return out;
    }
}
