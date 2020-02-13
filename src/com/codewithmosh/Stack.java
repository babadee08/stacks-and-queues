package com.codewithmosh;

import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int count;

    public void push(int val) {
        if (count == items.length) {
            throw new StackOverflowError();
        }
        items[count++] = val;
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public int peek() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, count));
    }
}
