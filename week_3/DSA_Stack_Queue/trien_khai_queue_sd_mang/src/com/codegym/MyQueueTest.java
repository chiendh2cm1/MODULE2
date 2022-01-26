package com.codegym;

import java.util.Arrays;

public class MyQueueTest {

    public static void main(String[] args) {
            MyQueue queue = new MyQueue(4);
            queue.enqueue(4);
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.dequeue();
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.enqueue(56);
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.enqueue(2);
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.enqueue(67);
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.dequeue();
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.dequeue();
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.enqueue(24);
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.dequeue();
            System.out.println(Arrays.toString(queue.getQueueArr()));
            queue.enqueue(98);
            queue.enqueue(45);
            queue.enqueue(23);
            queue.enqueue(435);
            System.out.println(Arrays.toString(queue.getQueueArr()));
    }
}
