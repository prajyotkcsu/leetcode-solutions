class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> currList=new ArrayList<>();
        boolean[] used =new boolean [nums.length];

        backtrack(nums,used,currList);
        return res;
    }

    public void backtrack(int[] arr, boolean[] used, List<Integer> currList){
        if(currList.size()==arr.length){
            res.add(new ArrayList<>(currList));
            return;
        }
        for(int i=0;i<arr.length;i++){
            //valid choice?
            if(used[i]){
                continue;    
            }
            //make choice
            currList.add(arr[i]);
            used[i]=true;
            //backtracking
            backtrack(arr,used,currList); 
            //undo choice
            currList.remove(currList.size()-1);
            used[i]=false;

        }
    
    }
}
