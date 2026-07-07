class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer, Integer>  count = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0 ; i < nums.length; i++){
            int temp = target-nums[i];
            if (count.containsKey(temp)){
                res[0]=count.get(temp);
                res[1]=i;
                return res;
            }
            count.put(nums[i],i);
        }
        return res;
    }
}
