import java.util.*;

public class Main{

public static void main(String[] args) {
 Scanner kb=new Scanner(System.in);
 int n=kb.nextInt();
 int inv=0;
 int OriginalPosition=1;
 int InverseDigit;
 int InversePosition;
 while(n!=0)
 {
     int OriginalDigit=n%10;
     InverseDigit=OriginalPosition;
      InversePosition=OriginalDigit;
     //inverse
     inv=inv+ InverseDigit *((int)Math.pow(10,InversePosition-1));
     OriginalPosition++;
     n=n/10;
 }
 System.out.println(inv);
 }
}
