class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] n = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int num = nums[i];
            if(!map.containsKey(nums[i]))
            {
                map.put(num,1);
            }
            else
            {
                map.put(num, map.get(num)+1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        for(int i=0; i<k; i++)
        {
            n[i] = list.get(i).getKey();
        }
        return n;
    }
}