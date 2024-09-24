import java.util.Arrays;

public class GrowableStack implements Stack {
    private Employee[] stack;
    private int top;

    public GrowableStack() {
        stack = new Employee[STACK_SIZE];  // Initial size of the stack
        top = -1;
    }

    @Override
    public void push(Employee e) {
        if (top == stack.length - 1) {
            stack = Arrays.copyOf(stack, stack.length * 2);  // Double the size when full
            System.out.println("Stack capacity increased!");
        }
        stack[++top] = e;
        System.out.println("Employee added to the Growable Stack.");
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No employees to pop.");
            return null;
        } else {
            return stack[top--];
        }
    }
}
