package estudos.java.maratonajava.javacore.ZZBcomportamento.test;

import estudos.java.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(
            new Car("Green", 2011),
            new Car("Red", 1998),
            new Car("Blue", 2019));


    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });

        List<Car> greenCar2 = filter(cars,car -> car.getColor().equals("Green"));
        List<Car> yearBeforeCar = filter(cars, car -> car.getYear() < 2016);

        System.out.println(greenCars);
        System.out.println(greenCar2);
        System.out.println(yearBeforeCar);
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(filter(nums, num ->num %2==0));
        // nums (lista de numeros / tipo) / num (variavel) -> num%2==0 (condição)


    }
   private static <T> List<T> filter(List<T> list, Predicate<T> predicate) { // este Predicate é nativo do java
        List<T> filterList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filterList.add(t);
            }
        }
        return filterList;
   }


}
