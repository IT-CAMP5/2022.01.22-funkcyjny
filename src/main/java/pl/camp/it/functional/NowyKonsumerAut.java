package pl.camp.it.functional;

import java.util.function.Consumer;

public class NowyKonsumerAut implements Consumer<Car> {
    @Override
    public void accept(Car car) {
        System.out.println("Zjadam auto jeszcze szybciej !!!!!");
    }
}
