

class Solution {
    public int[] twoSum(int[] nums, int target) {
 
        //optimum solution:
        /*
        taverse the array
        meth: check if the complement of the ele present in the hashmap runs: o(1) return: boolean
        if true return [i,get(complement)]
        meth: store ele and its position in a hashmap as key value pair runs: o(1)
        */
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                return new int[]{i,hm.get(target-nums[i])};
            }
            hm.put(nums[i],i);
        }
return new int[]{};
    }
}




class Solution{
    public int[] twoSum(int[] nums, int target){
        /*
        num1= pivot and num2 is each elements in forward direction
        num1 from the outer for loop
        num2 from the inner for loop
        sum=num1+num2
        if(sum equals to target)
        return int[] {i,j} 
        */

    // runs in 0(n2) but with no extra space.
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}


