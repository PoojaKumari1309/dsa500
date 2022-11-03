public int[] merge(int[]nums1,int[]nums2)
    { 
    int[] res=new int[nums1.length+nums2.length];
    int ptr1=0;
    int ptr2=0;
    int ptr3=0;
   
    while(ptr1<nums1.length&&ptr2<nums2.length)
    {
        if(nums1[ptr1]<=nums2[ptr2])
        {
        res[ptr3]=nums1[ptr1];
        ptr1++;
        ptr3++;
        }
        else
        {
          res[ptr3]=nums2[ptr2];
          ptr3++;
          ptr2++;
        }
    }
    while(ptr1<nums1.length)
    {
         res[ptr3]=nums1[ptr1];
        ptr1++;
        ptr3++;
    }
    while(ptr2<nums2.length)
    {
       res[ptr3]=nums2[ptr2];
          ptr3++;
          ptr2++;  
    }
    return res;

    }
    public int[] mergeSort(int[]arr,int l,int r)
    {
        if(l==r)
        {
            int[]ans=new int[1];
            ans[0]=arr[l];
            return ans;
        }
        int mid=(l+r)/2;
        int[] left=mergeSort(arr,l,mid);
        int[] right=mergeSort(arr,mid+1,r);
        return merge(left,right);
        
    }
    public int[] sortArray(int[] nums) {
         return mergeSort(nums,0,nums.length-1);
    }
