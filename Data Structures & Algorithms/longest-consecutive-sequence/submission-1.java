class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
        {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int[] arr = Arrays.stream(nums).distinct().toArray();
        
        int n = arr.length;
        
        int current = 1;
        int max = 1;
        
        for(int i = 0; i < n - 1; i++) {
            
            if(arr[i + 1] == arr[i] + 1) {
                current++;
            }
            else {
                max = Math.max(max, current);
                current = 1;
            }
        }
        
        max = Math.max(max, current);
        
        return max;
    }
}