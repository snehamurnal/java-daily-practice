import java.util.*;

class Stack3 
{
public static void main(String[] args) 
{
int min,max;

Stack<Integer> s = new Stack<Integer>();
s.push(77);
s.push(3);
s.push(99);
s.push(63);

max = s.peek();
min = s.peek();

for (int x :s) 
{
if(x>max)
{
max=x;
}
if(x<min)
{
min=x;
}
}

System.out.println("Maximum Element: " + max);
System.out.println("Minimum Element: " + min);
    }
}
