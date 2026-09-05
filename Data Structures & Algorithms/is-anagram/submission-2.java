class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(s == null || t == null || sl != tl)
        {
            return false;
        }
        
        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] charcounts = new int[256];

        for(int i=0; i<sl; i++)
        {
            charcounts[s.charAt(i)]++;
            charcounts[t.charAt(i)]--;
        }

        for(int count : charcounts)
        {
            if(count != 0)
            {
                return false;
            }
        }

        return true;
    }
}
