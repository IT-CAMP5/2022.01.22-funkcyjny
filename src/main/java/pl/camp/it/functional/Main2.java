package pl.camp.it.functional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main2 {
    public static void main(String[] args) {

        Function<Integer, Integer> multiply = x -> x*2;
        UnaryOperator<Integer> increaseBy5 = x -> x+8;
        UnaryOperator<Integer> decreaseBy3 = x -> x-3;

        call(decreaseBy3);
    }

    public static void call(Function<Integer, Integer> f) {
        System.out.println(f.apply(5));
    }
}
