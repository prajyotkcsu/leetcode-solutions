class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack("",n,n,2*n);
        return res;
    }

    public void backtrack(String currString, int remOpen,int remClose,int totalLength){
        if(currString.length()==totalLength){
            res.add(currString);
            return;
        }
        if(remOpen>0) backtrack(currString+'(',remOpen-1,remClose,totalLength);
        if(remClose>remOpen)backtrack(currString+')',remOpen,remClose-1,totalLength);

        return;
    }
}
