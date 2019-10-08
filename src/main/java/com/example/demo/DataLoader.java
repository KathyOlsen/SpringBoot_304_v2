package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car(2006, "Toyota", "Siena");
        repository.save(car);

        car = new Car(2008, "Nissan", "Maxima");
        repository.save(car);

        car = new Car(2019, "Ford", "Mustang");
        repository.save(car);
    }
}
