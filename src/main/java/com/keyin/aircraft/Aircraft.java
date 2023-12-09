package com.keyin.aircraft;

import com.keyin.airport.Airport;
import com.keyin.passenger.Passenger;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(
            name = "aircraft_sequence",
            sequenceName = "aircraft_sequence",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(generator = "aircraft_sequence")
    private long id;
    private String tailNumber;
    private String type;
    private String brand;
    private String model;
    private int numberOfPassengers;
    @ManyToMany
    private List<Airport> airports;
    @ManyToMany
    private List<Passenger> passengers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
