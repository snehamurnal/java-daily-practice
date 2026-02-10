//5.Write a Java program to remove duplicates from a given stack.

import java.util.Stack;

class Stack5
{
public static void main(String[]args)
{

Stack<Integer> s = new Stack<Integer>();

s.push(20);
s.push(33);
s.push(41);
s.push(33);
s.push(20);

System.out.println("original stack : "+s);


Stack<Integer> a = new Stack<Integer>();

while (!s.isEmpty()) 
{
int i;
int b = s.pop();
boolean found = false;

for (i=0;i<s.length;i++) 
{
if (i == b) 
{
found = true;
break;
}
else
{
a=s.pop();
}

}

System.out.println("stack without duplicates: "+a);
}
}
}
