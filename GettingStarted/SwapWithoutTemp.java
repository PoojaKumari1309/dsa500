//User function Template for Java

class Solution{
    static List<Integer> get(int a,int b)
    {
        a =a+b;
        b=a-b;
        a=a-b;
        List<Integer>list=new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
}
