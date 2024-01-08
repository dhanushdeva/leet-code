//005-Contains-Duplicat-II
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
      for(int i = 0;i < nums.length;i++)  
      {
          if(map.containsKey(nums[i]))
          {
            if(Math.abs(i-map.get(nums[i])) <= k)
                return true; 
          }
        map.put(nums[i],i);
      }
      return false;
    }
}
