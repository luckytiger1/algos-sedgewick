package com.stack;

public class Main {
    public static void main(String[] args) {
        LinkedListStackImpl<String> stackImpl = new LinkedListStackImpl<>();

        ArrayStackImpl<String> arrayStack = new ArrayStackImpl<>();

        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        stackImpl.push("test");
        stackImpl.push("test2");
        stackImpl.push("test3");
        stackImpl.pop();
        stackImpl.pop();

        System.out.println(arrayStack.pop());
        System.out.println(stackImpl.pop());
        System.out.println(stackImpl.isEmpty());
    }
}
