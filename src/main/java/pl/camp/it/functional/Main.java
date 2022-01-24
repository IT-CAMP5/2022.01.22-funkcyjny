package pl.camp.it.functional;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //call("a()");

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                System.out.println();
                return 2 * integer;
            }
        };

        int wynik = function.apply(2);

        System.out.println(wynik);

        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer * integer2;
            }
        };

        UnaryOperator<String> operatorUnarny = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.replace("a", "");
            }
        };

        System.out.println(operatorUnarny.apply("abcd"));

        Predicate<Double> predykat = new Predicate<Double>() {
            @Override
            public boolean test(Double aDouble) {
                return aDouble > 11.1;
            }
        };

        System.out.println(predykat.test(10.0));

        Supplier<Car> dostawcaSamochodow = new Supplier<Car>() {
            @Override
            public Car get() {
                return new Car("BMW", "5");
            }
        };

        Car c = dostawcaSamochodow.get();

        System.out.println(c);

        Consumer<Car> konsumerAut = new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                System.out.println("Zjadam takie auto:");
                System.out.println(car);
            }
        };

        konsumerAut.accept(new Car("Audi", "A5"));

        Consumer<Car> newConsumer = new NowyKonsumerAut();
        newConsumer.accept(new Car("Toyota", "Auris"));

        Function<String, Integer> countFunction = s -> s.length();

        System.out.println(countFunction.apply("laksjdflkj"));

        Consumer<Car> carConsumer = car -> {
            System.out.println("Zjadacz samochodów lambda się odpala !!!");
            System.out.println("Zjadacz zjada samochód");
            System.out.println(car);
        };

        carConsumer.accept(new Car("Mazda", "CX-5"));

        BiFunction<Integer, Integer, Integer> cos = (x,y) -> {
            x = x / 2;
            y = y / 3;
            return x * y + 1;
        };

        System.out.println(cos.apply(4,6));

        Supplier<Car> dostawca = () -> new Car("Volvo", "S90");

        System.out.println(dostawca.get());
    }

    public static void call(int x) {
        switch (x) {
            case 1:
                a();
                break;
            case 2:
                b();
                break;
            case 3:
                c();
                break;
        }
    }

    public static void a() {

    }

    public static void b() {

    }

    public static void c() {

    }
}
