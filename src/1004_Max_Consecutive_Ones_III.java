class Solution {


    public int longestOnes(int[] nums, int k) {
        int flipCount=k;
        Queue<Integer> prevZeroLocs=new LinkedList<>();
        //left and right starts from 0
        //if 1 right++
        //if 0 and  flipable return true, prevZero=save location, right++
        //if 0 and flippable return false, store maxLength=Math.max(maxLength,right-left+1), left=prevZero+1
        int left=0,right=0,maxLength=0,prevZero=0;
        while(right<nums.length){
        //if found '1' increment
            if(nums[right]==1){
                right++;
            }
            //if found '0' increment
            else if(nums[right]==0){
                if(flipCount>0){
                    flipCount--;
                    prevZeroLocs.add(right);
                    right++;
                }
                else{
                    maxLength=Math.max(maxLength,right-left);
                    left=prevZeroLocs.remove()+1;
                    flipCount=1;
                    //right stays on the zero itself.
                }

            }
        }

return maxLength;    }

}
