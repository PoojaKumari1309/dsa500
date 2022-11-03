public static int middle(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)return i;
            
        }
        return arr.length;
    }
    public int[] sortedSquares(int[] nums) {
        int right=middle(nums);
        int left=right-1;
        int ptr3=0;
        int[]arr=new int[nums.length];
        while(left>=0&& right<nums.length)
        {
            if(nums[left]*nums[left]<nums[right]*nums[right])
            {
                arr[ptr3]=nums[left]*nums[left];
                ptr3++;
                left--;
            }
            else
            {
                arr[ptr3]=nums[right]*nums[right];
                right++;
                ptr3++;
            }
        }
        while(left>=0)
        {
           arr[ptr3]=nums[left]*nums[left];
                ptr3++;
                left--;  
        }
        while(right<nums.length)
        {
            arr[ptr3]=nums[right]*nums[right];
            right++;
            ptr3++;  
        }
        return arr;
    }
