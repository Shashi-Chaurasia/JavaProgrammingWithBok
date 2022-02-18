package com.javaprogramming;
import com.javaprogramming.Box;
import com.javaprogramming.Stack;
public class Main {

    public static void main(String[] args) {

      /*  Box mybox1 = new Box(29 , 38 , 89);
        Box mybox2 = new Box(39 , 38 , 10);

        double vol = mybox1.volume();
        System.out.println(vol);*/

        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++) myStack1.push(i);

        for (int i = 10; i < 20; i++){ myStack2.push(i);}

        ///pop those number of the stack ;;;;;
        System.out.println("Stack1 poping ..........................");
        for (int i = 0; i <10 ; i++) {
            System.out.println(myStack1.pop());
        }
        ///-----------------------------------
        System.out.println("Stack2 poping..........................");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }







    }
}
