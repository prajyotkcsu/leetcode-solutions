class Solution {
    public boolean isValid(String s) {
        /*
        design:
        1.a define a stack of characters
        1.b declare and initiate a hashmap like this {{')':'('},{']','['},.........} key is closing, value is opening 
        2. interate over the string s char by char o(n)
        if char is an opening para, map.containsValue() o(1) , stack.push()
        else it will be a closing, no need to check because all we have is []().....
        else: stack.pop()--popped; inspect if the curr char and this one is a pair
                hm.get(c).equals(popped)
        use stack to push opening paranthesis and pop closing paranthesis, if they are a pair continue if not return false
        //on iteration completed, if stack.size()>0 return false else true, meaning all the opening has their closing too
        
        //test run: ()[]{}
        
        
        (


        }
        {
        
        
        */


//************ */

//]:[
        //design
        Stack<Character> stack=new Stack<>();
        Map<Character, Character> hm=new HashMap<>();
        hm.put('}','{');
        hm.put(')','(');
        hm.put(']','[');

        //base case: if a single char is present, meaning it's either an opening one or a closing one', simply return fasle
        if(s.length()==1){
            return false;
        }


        for(char c: s.toCharArray()){
            if(hm.containsValue(c)){//opening
                stack.push(c);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            char popped=stack.pop();
            if(!hm.get(c).equals(popped)){
                return false;
            }
        }
    }
    if(stack.size()>0){ //is not empty, for an opening there was no closing found
    return false;
    }
return true;
    }

}
