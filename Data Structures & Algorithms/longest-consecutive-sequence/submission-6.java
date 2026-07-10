class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int res = 0 ;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0 ; i < nums.length; i++){
            set.add(nums[i]);
        }
        for (int num : set){
             if (!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                res = Math.max(res, currentStreak);
             }           
        }
        
        return res;
        
    }
}
