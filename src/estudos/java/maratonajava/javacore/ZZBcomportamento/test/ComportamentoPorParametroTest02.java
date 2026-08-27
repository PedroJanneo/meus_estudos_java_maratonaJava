package estudos.java.maratonajava.javacore.ZZBcomportamento.test;

import estudos.java.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import estudos.java.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("Green", 2011),
            new Car("Red", 1998),
            new Car("Blue", 2019));


    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });

        List<Car> greenCar2 = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> yearBeforeCar = filter(cars, car -> car.getYear() < 2016);

        System.out.println(greenCars);
        System.out.println(greenCar2);
        System.out.println(yearBeforeCar);


    }
    private static List<Car> filter(List<Car> cars, CarPredicate predicate) { // carPredicate é interface criada
        List<Car> filteredCar = new ArrayList<>();


        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }


}
