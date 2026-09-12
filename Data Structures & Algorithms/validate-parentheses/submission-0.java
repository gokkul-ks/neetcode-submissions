class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        for(char x : s.toCharArray())
        {
            if(x=='[' || x=='(' || x=='{')
            {
                st.push(x);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                if(x==']' || x==')' || x=='}')
                {
                    char c = st.peek();
                    if(c == '[' && x == ']' || c == '(' && x == ')' || c == '{' && x == '}')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
