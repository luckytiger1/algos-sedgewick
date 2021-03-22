package com.stack;

public class ArrayStackImpl<T> {
    private T[] s;
    private int N = 0;

    public  ArrayStackImpl() {
        s = (T[]) new Object[1];
    }

    public void push(T item) {
        if(N == s.length) resize(2 * s.length);

        s[N++] = item;
    }

    public T pop() {
        T item = s[--N];
        s[N] = null;
        if(N > 0 && N == s.length / 4) resize(s.length/2);

        return item;
    }

    private void resize(int capacity) {
        T[] copy = (T[]) new Object[capacity];

        if (N >= 0) System.arraycopy(s, 0, copy, 0, N);

        s = copy;
    }
}
