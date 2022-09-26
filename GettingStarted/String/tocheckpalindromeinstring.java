import java.io.*;
import java.util.*;

public class Main {

public static boolean palindrome(String s)
{
    int lo=0;
    int hi=s.length()-1;
    while(lo<hi)
    {
        if(s.charAt(lo)!=s.charAt(hi))
        {
            return false;
            
        }
        lo++;
            hi--;
            
    }return true;
}
	public static void solution(String str){
	for(int i=0;i<str.length();i++)
	{
	    for(int j=i;j<str.length();j++)
	    {
	        String subString=str.substring(i,j+1);
	        if(palindrome(subString)==true)
	        System.out.println(subString);
	    }
	}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
