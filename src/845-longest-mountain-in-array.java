class Solution {
    public int longestMountain(int[] arr) {
        int maxLen=0, left=0, right=0;
        for(int i=1;i<arr.length-1;i++){
            if(isPeak(arr, i)){
                left=i;
                right=i;
                while(left>0 && !isValley(arr, left)){
                    left--;
                }
                while(right<arr.length-1 && !isValley(arr, right)){
                    right++;
                }
                maxLen=Math.max(maxLen,right-left+1);
            }
        }       
        return maxLen;
}
    boolean isPeak(int[] arr, int peak){
          if(arr[peak]>arr[peak-1] && arr[peak]>arr[peak+1]){
              return true;
          }
          return false;
      }
       boolean isValley(int[] arr, int v){
          if(arr[v]<arr[v-1] && arr[v]<arr[v+1])return true;
          else if(arr[v]==arr[v-1] || arr[v]==arr[v+1])return true;
          return false;
      }
}
