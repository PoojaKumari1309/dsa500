import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void reverse(int [] arr,int i,int j)
    {
         
        while(i<j)
        {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
       
    }
	public static void main (String[] args) {
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0)
		{
		     int n=kb.nextInt();
		     int k=kb.nextInt();
		     int[]arr=new int[n];
		     for(int i=0;i<n;i++)
		    {
		        arr[i]=kb.nextInt();
		    }
		    reverse(arr,0,k-1);
		    reverse(arr,k,n-1);
		    reverse(arr,0,n-1);
		    for(int l=0;l<arr.length;l++)
            {
               System.out.print(arr[l]+" ");
            }
            System.out.println();
       
        
		}
	}
}
