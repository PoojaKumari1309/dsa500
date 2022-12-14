class Solution {
    public static int[] result(int[]a,int[]b)
    {
        int i=a.length-1;
        int j=b.length-1;
        int size=(a.length>b.length)?a.length+1:b.length+1;
        int k=size-1;
        int []res=new int[size];
        int carry=0;
        while(i>=0||j>=0||carry>0)
        {
            int d1=(i>=0)?a[i]:0;
            int d2=(j>=0)?b[j]:0;
            if(d1+d2+carry<10)
            {
                res[k]=d1+d2+carry;
                carry=0;
            }
            else
            {
                res[k]=(d1+d2+carry)%10;
                carry=(d1+d2+carry)/10;
            }
            i--;
            j--;
            k--;
        }
        return res;
    }
    ArrayList<Integer> findSum(int a[], int b[]) {
        int[]res=result(a,b);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<res.length;i++)
        {
          if(i==0&&res[i]==0)
          {
              continue;
          }
          else
          {
              list.add(res[i]);
          }
          
        }
        return list;
    }
}
