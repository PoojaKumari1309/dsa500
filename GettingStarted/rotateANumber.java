import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner kb=new Scanner(System.in);
     int n=kb.nextInt();
     int k=kb.nextInt();
     int temp=n;
     int nod=0;
     //number of digits in the number
     while(temp>0)
     {
       temp=temp/10;
       nod++;
     }
     k=k%nod;
     if(k<0)
     {
         k=k+nod;
     }
     //divisor and multiple 
     int div=1;
     int mult=1;
     for(int i=1;i<=nod;i++)
     {
         if(i<=k)
         { 
             div=div*10;
         }
         else 
         { 
            mult= mult*10;
         }
     }
     // num/divisor=question+remainder*multi
     int q=n/div;
     int r=n%div;
     int  rot=r*mult+q;
      System.out.println(rot);
    }
   }
