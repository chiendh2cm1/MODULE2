
package com.codegym;


import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> elements = new LinkedList<>();

    public MyQueue() {
    }

    public void add(E e){
        elements.add(e);
    }

    public E peek(){
        if (this.elements.size()==0){
            return null;
        }
        return this.elements.get(0);
    }

    public E poll(){
        if (this.elements.size()==0){
            return null;
        }
        return this.elements.remove(0);
    }
}
