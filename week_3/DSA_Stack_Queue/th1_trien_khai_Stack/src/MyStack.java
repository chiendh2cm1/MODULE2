import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> elements = new ArrayList<>();

    public MyStack() {
    }

    public void push(E e){
        elements.add(elements.size()-1,e);
    }

    public void pop(){
        if (elements.size()==0){
            throw new IndexOutOfBoundsException("Stack is empty!!!");
        }
        elements.remove(elements.size()-1);
    }

    public void peek(){
        elements.get(elements.size()-1);
    }

}
