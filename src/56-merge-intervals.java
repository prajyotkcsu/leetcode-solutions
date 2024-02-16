class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> ls=new LinkedList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int[] interval: intervals){
            if(ls.isEmpty() || ls.getLast()[1]<interval[0]){ //not merging
                ls.add(interval);
            }
            else{//merging
                ls.getLast()[1]=Math.max(ls.getLast()[1],interval[1]); 
            }
        }
        return ls.toArray(new int[ls.size()][]);
    }
}
