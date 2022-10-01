class Compute {
    
    public int maximum(int[]arr,int idx,int max)
    {
    if(idx==arr.length)return max;
     
    if(max<arr[idx])
    {
        max=arr[idx];
    }

   
    
       return  maximum(arr,idx+1,max);
    }
    
    public int largest(int arr[], int n)
    {
        
       
        
        return  maximum(arr,0,0);
    }
}
