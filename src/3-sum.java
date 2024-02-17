class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //-4 -1 -1 0 1 2
        /*
        pivot complement 
        -5
        p1=0, p2=1
        sum=p1+p2
        complmt=0-(sum)
        find loc complmt in the hashmap
        set.add(sorted(p1,p2,loc))
        0, 1, 1
        p1 p2
        sum=1 find -1 if found set.add() el

        */ 
        Set<Integer> dic=new HashSet<>();
        Set<int[]> out=new HashSet<>();
        List<List<Integer>> combo=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int sum=nums[i]+nums[i+1];
            if(dic.size()>0 && dic.contains(-sum)){
                List<Integer> l1=Arrays.asList(nums[i], nums[i + 1],-sum);
                Collections.sort(l1);
                combo.add(l1);
            }
            dic.add(nums[i]);
        }

        return combo;
    }
}
