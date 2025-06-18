import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] res = new int[n / 3][3];
        Arrays.sort(nums);
        int j = 0;
        for(int i = 1; i < n - 1; i += 3){
            if(nums[i + 1] - nums[i  - 1] <= k){
                res[j][0] = nums[i - 1];
                res[j][1] = nums[i];
                res[j++][2] = nums[i + 1];
            }else {
                return new int[][]{};
            }
        }
        return res;
    }
}
