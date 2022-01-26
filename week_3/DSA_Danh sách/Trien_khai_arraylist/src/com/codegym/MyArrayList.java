package com.codegym;


import java.util.Arrays;

public class MyArrayList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) { // thêm vào cuối mảng
        if (this.elements.length == size) {
            int newCapacity = this.elements.length * 2;
            this.elements = Arrays.copyOf(elements, newCapacity);
        }
        this.elements[this.size] = e;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        return (E) this.elements[index];
    }


    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        if (this.elements.length == size) {
            int newCapacity = this.elements.length * 2;
            this.elements = Arrays.copyOf(elements, newCapacity);
        }
        for (int i = index + 1; i <= this.size; i++) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = e;
        this.size++;
    }

    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(e))
                return i;
        }
        return index;
    }

    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < this.elements.length; i++) {
            elements[i] = null;
        }
    }

}