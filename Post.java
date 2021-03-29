import java.io.*;
import java.util.*;

class Post {
	public static void main (String[] args)
	{
		System.out.println("Output: "+evalPf("12 4 / !"));
	}
	public static int evalPf(String str)
    {
        System.out.println("Input: "+str);
    Scanner sc = new Scanner(str);
    Stack<Integer> stack = new Stack<Integer>();

    while (sc.hasNext()) {
        if (sc.hasNextInt()) {
            stack.push(sc.nextInt());
            continue;
        }
        int e=1;
        int b = stack.pop();
        int a = stack.pop();
        char op = sc.next().charAt(0);
        if      (op == '+') stack.push(a + b);
        else if (op == '-') stack.push(a - b);
        else if (op == '*') stack.push(a * b);
        else if (op == '/') stack.push(a / b);
        else if (op == '%') stack.push(a % b);
        else if (op == '^') 
        {
                        for(int i=b;b>=1;b--)
                        {
                               e=e*stack.push(a);
                               System.out.println("e "+e);
                        }
                        stack.push(e);
        }
        else if (op == '!') 
        {
                       int f=1;
                       int i=1;
                      // int n=stack.push(b);
                                while(i<=5)
                                {
                                    f*=i;
                                    i++;
                                }
                                System.out.println(" p "+f); 
        }
    }

    sc.close();
    return stack.pop();
}
}