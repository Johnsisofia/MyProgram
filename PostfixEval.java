import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PostfixEval
{
    public static int postfixEval(String s1)
    {
        char s[]=s1.toCharArray();
        Stack<Integer> stack = new Stack<Integer>(); 
        for(int i=0;i<s1.length();i++)
        {
            if(s[i]>='0' && s[i]<='9')
               stack.push(s[i]-'0');
            else
            {
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                if(s[i]=='+')
                  stack.push(b+a);
                else if(s[i]=='-')
                  stack.push(b-a);
                else if(s[i]=='*')
                  stack.push(b*a);
                else if(s[i]=='/')
                  stack.push(b/a);
            }
        }
        return stack.peek();
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		System.out.println("Postfix evaluation: "+postfixEval(s1));
	}
}
