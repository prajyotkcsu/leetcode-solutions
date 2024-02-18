class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> currList=new ArrayList<>();
        backtrack(nums,0,currList);
        return res; 
    }
    public void backtrack(int[] arr, int currIndex, List<Integer> currList)
    {
        res.add(new ArrayList<Integer>(currList));
        if(currIndex==arr.length) return;
        for(int i=currIndex;i<arr.length;i++)
        {
            currList.add(arr[i]);
            backtrack(arr,i+1,currList);
            currList.remove(currList.size()-1);
        }
        return;
    }    
}
