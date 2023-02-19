package io.tutorial.spring.garageApp.repository;
import io.tutorial.spring.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car,Long> {
}
