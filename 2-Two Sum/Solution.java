class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sum =new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(sum.containsKey(value)){
                return new int[]{sum.get(value),i};
            }
            sum.put(nums[i],i);
        }


        return new int[]{};
    }

}
