package com.javaprogramming;

public class Stack {
    int[] stck = new int[10];
    int tos;

    //Initializing the length of stack
    public Stack() {
        this.tos = -1;
    }
    //Push an item in the Stack
    public void push(int item){
        if (tos == 9) {
            System.out.println("Stack have been full!");
        }
        else {
            stck[++tos] = item;
        }
    }

    //Pup an item from stack............
    public int pop(){
        if (tos<0) {
            System.out.println("Stack is empty !");
            return 0;

        }
        else{
            System.out.println("Stack successfully pop ...");
            return stck[tos--];
        }
    }
}
