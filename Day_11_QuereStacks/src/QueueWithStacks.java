import java.util.Stack;

public class QueueWithStacks {
    private Stack<Integer> stackOne;
    private Stack<Integer> stackTwo;

    public QueueWithStacks() {
        this.stackOne = new Stack<>();
        this.stackTwo = new Stack<>();
    }
    //https://algs4.cs.princeton.edu/13stacks/QueueWithTwoStacks.java.html
    // Got stuck on opening block and found above link to help understand the two instance QueueWithStacks
    public void enqueue (int value) {
        stackOne.push(value);
    }

    public Integer dequeue () {
        Integer result;
        if (stackOne.isEmpty()) {
            System.out.println("Stack Underflow");
            result = null;
            return result;
        }
        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
        result = stackTwo.pop();
        while(!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
        return result;
    }

    // thanks to Amy and stack overflow for this block of code
    @Override public String toString() {
        return stackOne.toString();
    }
}