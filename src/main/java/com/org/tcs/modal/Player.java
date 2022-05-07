package com.org.tcs.modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Player {
@Id
    private int id;
private String name;
private String address;
private Double salery;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalery() {
        return salery;
    }

    public void setSalery(Double salery) {
        this.salery = salery;
    }
}
