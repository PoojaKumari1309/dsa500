class Solution {
    public String removeOuterParentheses(String s) {
        boolean[] isOuter=new boolean[s.length()];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stk.push(i);
            }
            else
            {
                int open=stk.pop();
                if(stk.size()==0)
                {
                    isOuter[i]=isOuter[open]=true;
                }
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(isOuter[i]==false)
            {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
