class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int copy = x;
        while(copy > 0)
        {
            int num = copy%10;
            rev = (rev * 10) + num;
            copy/=10;
        }
        if(x == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}