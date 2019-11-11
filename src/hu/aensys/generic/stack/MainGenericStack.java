package hu.aensys.generic.stack;

import hu.aensys.generic.stack.ArrayStack;
import hu.aensys.generic.stack.Stack;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class MainGenericStack {

    public static void main(String[] args) {

        final Stack<Integer> intStack = new ArrayStack<>(4);

        System.out.println("=====PUSH=====");
        for (int i = 0; i < intStack.capacity() * 2; i++) {
            System.out.println("push(" + i + ")");
            intStack.push(i);
        }
        System.out.println(intStack);

        System.out.println("=====POP=====");
        for (int i = 0; i < intStack.capacity() * 2; i++) {
            System.out.println(i + ".\t pop()\t" + intStack.pop());
        }
        System.out.println(intStack);


        System.out.println("=====PUSH=====");
        for (int i = 0; i < intStack.capacity() * 2; i++) {
            System.out.println("push(" + i + ")");
            intStack.push(i);
        }
        System.out.println(intStack);

        System.out.println("=====Clear=====");
        intStack.clear();
        System.out.println(intStack);



    }
}
