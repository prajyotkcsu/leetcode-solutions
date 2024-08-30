public class MaxSumArray {
    public static void main(String[] args) {
        int[] arr={6,3,-3,7};
        int maxSum=arr[0];
        int currSum=maxSum;
        for(int i=1;i<arr.length;i++){
            currSum=Math.max(currSum+arr[i],arr[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
}
