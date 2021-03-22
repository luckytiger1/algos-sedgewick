package com.stack;

public class LinkedListStackImpl<T> {
    private Node<T> first = null;

    private static class Node<T> {
        T item;
        Node<T> next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push (T item) {
        Node<T> oldNode = first;
        first = new Node<>();
        first.item = item;
        first.next = oldNode;
    }

    public T pop() {
        T item = first.item;
        first = first.next;
        return item;
    }
}
