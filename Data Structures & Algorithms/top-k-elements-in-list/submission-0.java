class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer,Integer> a = new HashMap<>();

        for (int i = 0 ; i < nums.length;i++){

           a.put(nums[i], a.getOrDefault(nums[i], 0) + 1);
        }
        
        while ( k !=0 ){
            Map.Entry<Integer, Integer> maxEntry = Collections.max(
            a.entrySet(), 
            Map.Entry.comparingByValue()
            );
            res[k-1] = maxEntry.getKey();
            a.remove(maxEntry.getKey());

            k--;
        }

        return res;
    }
}
