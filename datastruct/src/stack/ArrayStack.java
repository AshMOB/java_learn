package stack;

public class ArrayStack {
    private int maxStack;

    private int[] stack;

    private int top = -1;

    public ArrayStack(int maxStack) {
        this.maxStack = maxStack;
        stack=new int[maxStack];
    }

    public boolean isFull() {
        return this.top == this.maxStack - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(int val) {
        if (isFull()) {
            throw new RuntimeException("此栈已满");
        } else {
            top++;
            this.stack[top] = val;
        }
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("空栈");
        }
        int val=this.stack[this.top];
        this.top--;
        return val;
    }

    public void list(){
        if (isEmpty()){
            throw  new RuntimeException("空栈");

        }
        for (int i = 0; i < this.stack.length; i++) {
            System.out.printf("stack[%d]=%d",i,this.stack[i]);
        }
    }


}
