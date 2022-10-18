 Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> common =new ArrayList <>();
        int ptr1=0;
        int ptr2=0;
        while(ptr1<nums1.length && ptr2<nums2.length)
   {
        if(nums1[ptr1]<nums2[ptr2])
        {
            ptr1++;
        }
        else if(nums2[ptr2]<nums1[ptr1])
        {
            ptr2++;
        }
        else
     {
        int value=nums1[ptr1];
        common.add(value);
        while(ptr1<nums1.length&&nums1[ptr1]==value )
         { 
            ptr1++; 
         }
         while( ptr2<nums2.length&&nums2[ptr2]==value )
         {
             ptr2++;
         }
     }
    }
    int[]res= new int[common.size()];
    for(int i=0;i<common.size();i++)
    {
        res[i]=common.get(i);
    }
    return res;
    }
