package gr.codehub.firstsetofexercises.firstsetofexercises;

public class MyStack {

    private int array[];
    private int top;
    private int capacity;

    //constructor
    MyStack(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isStackFull()) {
            System.exit(1);
        }
        array[++top] = x;
    }

    public Boolean isStackFull() {
        return top == capacity - 1;    // or return size() == capacity;
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        if (!isEmpty())
            return array[top];
        else
            System.exit(1);

        return -1;
    }

    public Boolean isEmpty() {
        return top == -1;    // or return size() == 0;
    }

    public void pop() {
        // check for stack underflow
        if (isEmpty()) {
            System.exit(1);
        }
        top--;
    }


    public static void main(String[] args) {

        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println("The top element is: " + stack.peek());
        stack.pop();
        System.out.println("The top element now is: " + stack.peek());

    }


}


