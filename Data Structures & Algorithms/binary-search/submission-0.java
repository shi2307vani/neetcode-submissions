class Solution {
    public int search(int[] nums, int target) {
        boolean f = true;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                f = false;
                ans = i;
                break;
            }
            else{
                ans = -1;
            }
            
        }
        return ans;
    }
}
