import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        printSS(str,"",0);

        

    }

    public static void printSS(String str, String ans,int idx) {
        if(idx==str.length())
        {
        System.out.println(ans);
        return ;
        }
        char ch=str.charAt(idx);
        //no call
        printSS(str,ans+ch,idx+1);
        
        //yes call
       
         printSS(str,ans,idx+1);
    }

}
