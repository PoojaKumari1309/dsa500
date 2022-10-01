class Solution
{ 
    public static int FirstIndex(int[]arr,int idx,int target)
    
    { 
        if(idx==arr.length)return -1;
        if(target==arr[idx])return idx;
    
        return FirstIndex(arr,idx+1,target);
    }
    public static int LastIndex(int[]arr,int idx,int target)
    {
        if(idx==-1)return -1;
        if(target==arr[idx])return idx;
        
        return LastIndex(arr,idx-1,target);
    }
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        int[]res=new int[2];
        res[0]=FirstIndex(a,0,key);
        res[1]=LastIndex(a,a.length-1,key);
        return res;
    }
}
