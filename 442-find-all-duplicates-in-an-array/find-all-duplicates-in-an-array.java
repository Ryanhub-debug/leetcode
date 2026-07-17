class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                
               list.add(nums[i]);
            }
            else
            {
               set.add(nums[i]); 
            }
            
        }
        return list;
    }
}