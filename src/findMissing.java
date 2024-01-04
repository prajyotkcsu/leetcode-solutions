import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findMissing {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,5,7,8,8};
            List<Integer> res=new ArrayList<>();
            Set<Integer> set=new HashSet<>();
            for(int num:nums){
                set.add(num);
            }
            for(int i=1;i<nums.length;i++){
                if(!set.contains(1){
                    res.add(nums[i]);
                }
            }
System.out.println(res);
        }
    }
