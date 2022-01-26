package com.codegym;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNotes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNotes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = new Node(e);
        numNotes++;
    }

    public void add(int index, E e) {
        Node temp = head;
        Node hoder;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        hoder = temp.next;
        temp.next = new Node(e);
        temp.next.next = hoder;
        numNotes++;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.next.data;
    }

    public int size() {
        return numNotes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNotes) {
            throw new IllegalArgumentException("index: " + index);
        }

        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNotes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNotes--;
        }
        return (E) data;
    }

}
