class Solution {
    public int search(int[] nums, int target) {
        //find the mid and see if it is the target, if it is return, else if it is smaller than the target, meaning target is on the right side of mid, else left side of mid
        //repeat these until left<=right
int n=nums.length-1;
int left=0;
int right=n;
    while(left<=right){
        int mid=right+left/2;
        if(target==nums[mid]){
            return mid;
        }
        else if(target>nums[mid]){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return -1;
    }
}
