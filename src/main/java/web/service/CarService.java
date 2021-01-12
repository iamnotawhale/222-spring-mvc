package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    List<Car> listOfCars = new ArrayList<>();


    public List<Car> getCars(Integer count) {
        listOfCars.add(new Car("Toyota", "Carolla", 2005));
        listOfCars.add(new Car("Kia", "Spectra", 2010));
        listOfCars.add(new Car("Lada", "Granta", 2012));
        listOfCars.add(new Car("BMW", "X6", 2018));
        listOfCars.add(new Car("AUDI", "4", 2016));
        if (count == null || count > 5) {
            count = listOfCars.size();
        }
        List<Car> subList = null;
        for (Integer i = 0; i < count; i++) {
            subList = listOfCars.subList(0, count);
        }
        return subList;
    }
}