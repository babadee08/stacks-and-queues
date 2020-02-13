package com.codewithmosh;

import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        /*Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());

        String str = "ABCDEFGHIJK";
        StringReverser stringReverser = new StringReverser();
        System.out.println(stringReverser.reverse(str));

        System.out.println(stringReverser.isBalanced("((()))"));
        System.out.println(stringReverser.isBalanced("<{()}>"));
        System.out.println(stringReverser.isBalanced("<{()}}"));
        System.out.println(stringReverser.isBalanced("<{()}>}"));

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.remove());
        System.out.println(queue);
        queue.add(40);
        queue.add(50);
        reverse(queue);
        System.out.println(queue);*/

        /*int[] edgeCases = { 0, 1, 2, 3, 4, 5, 10, 11, 12, 13, 14, 20, 21, 22, 23, 24, 100, 101, 102, 103, 104, 111, 112, 113, 114 };
        for (int edgeCase : edgeCases) {
            // System.out.println(ordinal(edgeCase));
            System.out.println(edgeCase + getOrdinalIndicator(edgeCase));
        }*/

        /*ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        System.out.println(arrayQueue);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);
        arrayQueue.enqueue(70);
        System.out.println(arrayQueue);
        arrayQueue.enqueue(80);

        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }*/

        PriorityQueue queue = new PriorityQueue(5);
        queue.insert(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(1);
        queue.insert(4);
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    public static void reverse(Queue<Integer> queue) {
        java.util.Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static String ordinal(int i) {
        String[] sufixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + sufixes[i % 10];

        }
    }

    public static String getOrdinalIndicator(int number) {
        int mod = number;
        if (number > 13) {
            mod = number % 10;
        }
        switch (mod) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
