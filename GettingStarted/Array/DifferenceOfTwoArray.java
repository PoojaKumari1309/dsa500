import java.io.*;
import java.util.*;

public class Main{
    public static int[] diiference(int[]arr1,int[]arr2)
    {
        int i=arr1.length-1;
        int j=arr2.length-1;
        int size=arr2.length;
        int k=size-1;
        int[]res=new int[size];
        int bo=0;
        while(j>=0)
        {
            int d1=(i>=0)?arr1[i]:0;
            int d2=arr2[j];
            if(d2-d1+bo<0)
            {
                res[k]=d2-d1+bo+10;
                bo=-1;
            }
            else
            {
                res[k]=d2-d1+bo;
                bo=0;
            }
            i--;
            j--;
            k--;
        }
        return res;
    }

public static void main(String[] args) throws Exception {
Scanner kb=new Scanner(System.in);
int n1=kb.nextInt();
int[]arr1=new int[n1];
for(int i=0;i<arr1.length;i++)
{
    arr1[i]=kb.nextInt();
}
int n2=kb.nextInt();
int[]arr2=new int[n2];
for(int j=0;j<arr2.length;j++)
{
    arr2[j]=kb.nextInt();
}
    int[]res=diiference(arr1,arr2);
    int idx=0;
    while(idx<res.length&& res[idx]==0)
    {
        idx++;
    }
    if(idx==res.length)
    {
        System.out.println("0");
    }
    while(idx<res.length)
    {
        System.out.println(res[idx]);
        idx++;
    }
    
    
