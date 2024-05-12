package com.sparksuccess.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
@Document(collection = "cars")
public class Car {
    @Id
    private String id;

    private String VIN;
    private String coordinates;
    // Constructor
    public Car(String VIN, String coordinates) {
        this.VIN = VIN;
        this.coordinates = coordinates;
    }

    // Getters and Setters
    public String getVIN() {
        return VIN;
    }

    // Setter for VIN
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    // Getter for coordinates
    public String getCoordinates() {
        return coordinates;
    }

    // Setter for coordinates
    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

}
