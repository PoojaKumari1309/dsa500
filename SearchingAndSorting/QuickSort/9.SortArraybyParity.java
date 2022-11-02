 public int[] Approach1(int[]arr)
    {
        int[]res=new int[arr.length];
        int left=0;
        int right=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                res[left]=arr[i];
                left+=2;
            }
            else
            {
                res[right]=arr[i];
                right+=2;
            }

        }
        return res;
    }
    //no extra space
    public int[]  Approach2(int[]arr)
    {
     int even=0;
     int odd=1;
     while(even<arr.length&& odd<arr.length)
     {
         while(even<arr.length&& arr[even]%2==0)even+=2;
         while(odd<arr.length&& arr[odd]%2!=0)odd+=2;
         if(even<arr.length&& odd<arr.length)
         {
             int temp=arr[even];
             arr[even]=arr[odd];
             arr[odd]=temp;
         }
     }
     return arr;
    }
    public int[] sortArrayByParityII(int[] nums) {
    //   return   Approach1(nums);
         return   Approach2(nums);
    }
}
