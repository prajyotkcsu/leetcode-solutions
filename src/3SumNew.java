public class Main {
    public static void main(String[] args) {
        //int[] arr={2,3,4,10,5,1};
        int[] arr={1,3,0,-1};
        int target=0;
        Arrays.sort(arr);
        int twoSum=0;
        Set<Integer> visited= new HashSet<>();
        List<List<Integer>>result=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            visited.add(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                twoSum=arr[i]+arr[j];
                if(visited.contains(target-twoSum)){
                    List<Integer> preResult=new ArrayList<Integer>(Arrays.asList(arr[i],arr[j],target-twoSum));
                    result.add(preResult);
                }
            }
        }
        System.out.println(result);

    }
}
