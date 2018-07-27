import java.util.Stack;

public class MaxStack extends Stack {
    Stack<Integer> realStack;
    Stack<Integer> maxStack;

    public MaxStack() {
        realStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void pushmax(int value) {
        if (realStack.isEmpty()) {
            realStack.push(value);
            maxStack.push(value);
        } else {
            int max = maxStack.peek();
            maxStack.push(Math.max(max, value));
            realStack.push(value);
        }
    }
    public Integer popmax() {
        if (!realStack.isEmpty()) {
            maxStack.pop();
            return realStack.pop();
        } else {
            System.out.println("Stack is Empty");
            return null;
        }
    }

    public Integer max() {
       if (!maxStack.isEmpty()) {
           return maxStack.peek();
       } else {
           System.out.println("List Is Empty");
           return null;
       }
    }
}
