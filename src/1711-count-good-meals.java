class Solution {
    public int countPairs(int[] deliciousness) {
        int maxSum = Arrays.stream(deliciousness).max().getAsInt()*2;
        int res=1;
        Set<Integer> dic=new LinkedHashSet<>();
        for(int power=0;power<21;power++){
            res=(int)Math.pow(2,power);
            if(res>maxSum)break;
            dic.add(res);
        }
        /*
        for i on each
            for j=i+1
                if dic.contains(nums[j]+nums[i])
                    count++
        */
        int count=0;
        for(int i=0;i<deliciousness.length;i++){
            for(int j=i+1;j<deliciousness.length;j++){
                if(dic.contains(deliciousness[i]+deliciousness[j]))count++;
            }
        }
    return count;

        }
}
