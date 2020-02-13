package com.codewithmosh;

import java.util.Arrays;

public class ArrayQueue {
    private int[] arrayQueue;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int size) {
        arrayQueue = new int[size];
    }

    public void enqueue(int value) {
        if (count == arrayQueue.length) {
            throw new IllegalStateException();
        }
        arrayQueue[rear] = value;
        rear = (rear + 1) % arrayQueue.length;
        count++;
    }

    public int dequeue() {
        int item = arrayQueue[front];
        arrayQueue[front] = 0;
        front = (front + 1) % arrayQueue.length;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayQueue);
    }
}
