class Solution {
    public boolean hasDuplicate(int[] nums) {


        HashMap<Integer, Integer> count = new HashMap<>();
        for ( int i = 0 ; i < nums.length ; i++){
            if (count.containsKey(nums[i])){
                return true;
            }
            count.put(nums[i], i);
        }
        return false;
    }
}