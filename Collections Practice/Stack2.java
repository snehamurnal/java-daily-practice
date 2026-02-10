//2.Write the java program to sort the Stack values in descending order.

import java.util.*;

class Stack2
{
public static void main(String[] args) 
{
Stack<Integer> s = new Stack<>();
s.push(20);
s.push(33);
s.push(41);
s.push(64);

Stack<Integer> temp = new Stack<>();

        while (!s.isEmpty()) {
            int cur = s.pop();

            while (!temp.isEmpty() && temp.peek() < cur) {
                s.push(temp.pop());
            }
            temp.push(cur);
        }

        System.out.println("Descending Order Stack: " + temp);
    }
}
