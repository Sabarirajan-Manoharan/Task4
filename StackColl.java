package Task4;

import java.util.Stack;

public class StackColl {
    private Stack<Integer> stack;

    public StackColl() {
        stack = new Stack<>();
    }

    public void pushElement(int i){
        stack.push(i);
        System.out.println(i + "Pushed Successfully.");

    }

    public void popElement(int i){

        if(stack.contains(i)){
            stack.pop();
        }else{
            System.out.println(i + " is not available in Stack");
        }

    }

    public boolean isEmpty(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack is Not Empty");
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }

        return true;
    }


    public static void main(String[] args) {

        StackColl sc = new StackColl();

        sc.pushElement(1);
        sc.pushElement(2);
        sc.pushElement(3);
        sc.pushElement(4);
        sc.pushElement(5);

        sc.isEmpty();

        sc.popElement(5);


    }



}
