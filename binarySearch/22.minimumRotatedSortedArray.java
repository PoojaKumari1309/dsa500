public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(nums.length==1 || nums[0]<nums[nums.length-1])return nums[0];

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(mid>0&& nums[mid]<nums[mid-1])return nums[mid];
            else if(nums[mid]<nums[right])right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
