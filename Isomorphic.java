/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Isomorphic
{
	public static boolean isIsomorphic(String str1, String str2)
	{
		if(str1==null || str2==null || str1.length()!=str2.length())
		   return false;
		   
		Map<Character, Character> map = new HashMap<>();
		for(int i=0;i<str1.length();i++) 
		{
            char char_str1=str1.charAt(i),char_str2=str2.charAt(i);
            if(map.containsKey(char_str1)) 
			{
                if(map.get(char_str1)!=char_str2)
					return false;
            }
			else 
			{
                if(map.containsValue(char_str2)) 
					return false;
                map.put(char_str1, char_str2);
            }
        }
        
        return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		if(isIsomorphic(str1,str2))
		   System.out.println("True");
		else
		   System.out.println("False");
	}
}
