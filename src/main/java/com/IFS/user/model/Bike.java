package com.IFS.user.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bike {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id ;
    private String chassisNumber;
    private String engineNumber;
    private String model;
    private String type;
    private String color;
    private int engineCapacity;



}
