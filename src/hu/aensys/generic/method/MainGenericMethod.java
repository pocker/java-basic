package hu.aensys.generic.method;

import hu.aensys.generic.stack.ArrayStack;
import hu.aensys.generic.stack.Stack;

import java.util.Collection;
import java.util.Objects;
import java.util.Random;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class MainGenericMethod {

    public static <T,S extends Comparable<S>>void compare(S a, S b) {
        System.out.println("compare(" + a + ", " + b + ")\t" + a.compareTo(b));
    }

    public static <T extends Number> void isValueEquals(T a, T b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        System.out.println("isValueEquals(" + a + ", " + b + ")\t" + (a.doubleValue() == b.doubleValue()));
    }

    public static void sumStack(final Stack<? extends Number> stack) {

        double sum = 0.0d;

        while (!stack.isEmpty()) {
            sum += stack.pop().doubleValue();
        }

        System.out.println("The sum of the stack is:\t" + sum);
    }


    public static void populateInt(Stack<? super Integer> list) {
        Random random = new Random();
        for(int i=0;i<100;i++){
            list.push(random.nextInt());
        }
    }

    public static void populateFloat(Stack<? super Float> list) {
        Random random = new Random();
        for(int i=0;i<100;i++){
            list.push(random.nextFloat());
        }
    }

    public static void main(String[] args) {

        //compare("a", 213);
        compare("a", "213");

        //isValueEquals(0.111111111d, "0.111111111f");
        isValueEquals(123, 12324);
        isValueEquals(123, 123.0f);
        isValueEquals(123, 123.0d);
        isValueEquals(0.111111111d, 0.111111111f);

        final Stack<Integer> intStack = new ArrayStack<>();
        intStack.push(2);
        intStack.push(34);
        intStack.push(6);

        sumStack(intStack);

        final Stack<Double> doubleStack = new ArrayStack<>();
        doubleStack.push(2435d);
        doubleStack.push(3443d);
        doubleStack.push(26.34d);

        sumStack(doubleStack);

        final Stack<String> stringStack = new ArrayStack<>();
        stringStack.push("AS");
        stringStack.push("askjdhaskjfh");
        stringStack.push("asdjfhjd");

        //sumStack(stringStack);

        final Stack<Number> numberStack = new ArrayStack<>(400);

        numberStack.push(1.0d);
        numberStack.push(1.0f);
        numberStack.push(1);
        populateInt(numberStack);
        populateFloat(numberStack);
        System.out.println(numberStack);
    }
}
