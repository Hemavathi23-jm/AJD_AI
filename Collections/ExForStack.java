import java.util.*;
public class ExForStack {
    public static void main(String[] args) {
        Stack<Float> s = new Stack<Float>();
        s.push(1.0f);//push () method is used to add elements to the top of the stack
        s.push(2.0f);
        s.push(3.0f);
        for(Float f: s) {
            System.out.println(f);
        }
        System.out.println("Top element: " + s.peek());//peek() method is used to get the top element of the stack without removing it
        System.out.println("Popped element: " + s.pop());//pop() method is used to remove the top element of the stack
        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
        if(s.empty()) {//empty() method is used to check if the stack is empty or not
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
