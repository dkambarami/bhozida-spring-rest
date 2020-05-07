package com.bhozida.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cost implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String item;
    private String unit;
    private Double cost;
    private Double quantity;
    public Cost(){
        
    }
    public Cost(String type, String item,String unit,Double cost, Double quantity){
        this.type=type;
        this.item=item;
        this.unit=unit;
        this.cost=cost;
        this.quantity=quantity;
    }
}
