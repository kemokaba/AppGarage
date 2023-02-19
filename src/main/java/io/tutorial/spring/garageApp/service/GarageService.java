package io.tutorial.spring.garageApp.service;

import io.tutorial.spring.garageApp.model.Car;
import io.tutorial.spring.garageApp.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class GarageService {
    @Autowired
    private GarageRepository garageRepository;

    /*static  private ArrayList <Car> cars = new ArrayList<>(Arrays.asList(
            new Car(1,"Laguna","Dacia",2005, Car.Color.YELLOW),
            new Car(2,"5004","Renault",2010, Car.Color.RED),
            new Car(3,"C4","Peugeot",1996, Car.Color.GREEN),
            new Car(4,"207","Citroen",2000, Car.Color.BLUE),
            new Car(5,"505","Nissan",2007, Car.Color.RED),
            new Car(6,"444","Pajero",2004, Car.Color.GREEN)
    ));*/

    public List<Car> getCars(){
        List<Car> cars =  new ArrayList<>();
        garageRepository.findAll().forEach(car -> {
            cars.add(car);
        });
        return cars;
    }

    public Car getCar(long id) {
        //return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
        return garageRepository.findById(id).orElse(null);
    }
     public void deleteCar(long id){
        garageRepository.deleteById(id);
        //cars.removeIf(car -> car.getId() == id);
     }

    public void addCar(Car car) {
        garageRepository.save(car);
        //cars.add(car);
    }

    public void updateCar(Car car, long id) {
        garageRepository.save(car);
        /*cars.forEach(car1 -> {
            if(car1.getId() == id){
                cars.set(cars.indexOf(car1),car);
            }
        });*/
    }
}
