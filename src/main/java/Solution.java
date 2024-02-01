import java.util.*;
public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i + 2] - nums[i] <= k){
                list.add(new int[]{nums[i],nums[i + 1],nums[i +2]});
                i+= 2;
            }else{
                return new int[][]{};
            }
        }

        int n = list.size();
        int[][] res = new int[n][3];

        for (int i = 0; i < n; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
