class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
       
        arr[0] = 1;
        for(int i=1; i<len; i++)
        {
            arr[i] = arr[i-1] * nums[i-1];
        }

        int right = 1;
        for(int j=len - 1; j>=0; j--)
        {
            arr[j] *= right;
            right *= nums[j];
        }

        return arr;
    }
}  