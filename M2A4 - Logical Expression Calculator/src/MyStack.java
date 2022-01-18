import java.util.ArrayList;

public class MyStack<E> implements StackInterface<E>{

    ArrayList<E> array = new ArrayList<>();

    public static final int MAX_SIZE = 15; //Arbitrary value since ArrayList has a very large cap. Changeable.
    private int top = -1;

    public void push(E j) throws StackFullException{
        if (isFull()){
            throw new StackFullException("Stack is already full!");
        }
        else {
            array.add(j);
            top++;
        }
    }

    public void pop() throws StackEmptyException{
        if (isEmpty()){
            throw new StackEmptyException("Stack is empty!");
        }
        else {
            array.remove(top);
            top--;
        }
    }

    public E top() throws StackEmptyException{
        if (isEmpty()){
            throw new StackEmptyException("Stack is empty!");
        }
        else {
            return array.get(top);
        }
    }

    public boolean isEmpty(){
        return top == -1; //returns true if top == -1
    }
    public boolean isFull(){
        return top == MAX_SIZE;
    }
    public int size(){
        return array.size();
    }
}
