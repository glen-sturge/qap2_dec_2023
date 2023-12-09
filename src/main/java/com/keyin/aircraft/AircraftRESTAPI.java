package com.keyin.aircraft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "aircraft", path = "aircraft")
public interface AircraftRESTAPI extends JpaRepository<Aircraft, Long> {
    public List<Aircraft> findByTailNumber(@RequestParam String tailNumber);
    public List<Aircraft> findByType(@RequestParam String type);
    public List<Aircraft> findByBrand(@RequestParam String brand);
    public List<Aircraft> findByModel(@RequestParam String model);
    public List<Aircraft> findByTypeAndBrand(@RequestParam String type, @RequestParam String brand);
    public List<Aircraft> findByNumberOfPassengers(@RequestParam int numberOfPassengers);
    public List<Aircraft> findByNumberOfPassengersGreaterThan(@RequestParam int numberOfPassengers);
    public List<Aircraft> findByNumberOfPassengersLessThan(@RequestParam int numberOfPassengers);
}
