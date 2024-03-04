class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //1 3 5 2 7 8 2 2 
        //find mid; if mid>mid+1 we do not want mid+1 part at all!! so new right becomes mid
        //when opposite is true left=mid+1
        // 1 2 3 2 5
        int left=0, right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid+1]){
                right=mid;
                if(arr[mid]>arr[mid-1])return mid; //until this point mid> mid+1 so immediately check if mid is also > than mid-1
            }
            else{
                left=mid+1;

            }
        }
        return left;
    }
}
