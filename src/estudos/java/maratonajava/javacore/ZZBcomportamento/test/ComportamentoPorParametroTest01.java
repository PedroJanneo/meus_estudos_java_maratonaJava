package estudos.java.maratonajava.javacore.ZZBcomportamento.test;

import estudos.java.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;


public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("Green", 2011),
            new Car("Red", 1998),
            new Car("Blue", 2019));


    public static void main(String[] args) {

//        System.out.println(filterGreenCar(cars));

        System.out.println(filterColorCar(cars,"Green"));
        System.out.println(filterColorCar(cars,"Red"));
        System.out.println(filterByYearBefore(cars,2016));



    }
    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterColorCar(List<Car> cars, String color) {
        List<Car> carsList = new ArrayList<>();


        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carsList.add(car);
            }
        }
        return carsList;
    }
    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> carsList = new ArrayList<>();


        for (Car car : cars) {
            if (car.getYear() < year) {
                carsList.add(car);
            }
        }
        return carsList;
    }
}
