public static void swap(int[]arr,int i,int j)
   {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++)
	    {
	        int min=i;
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[min]>arr[j])
	            {
	                min=j;
	            }
	       
	        }
	        swap(arr,min,i);
	    }
	}
