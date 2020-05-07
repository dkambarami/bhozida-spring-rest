package com.bhozida.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Idea implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;
    private String imageUrl;
    private String sector;
    private String size;
    private String description;
    private String process;
    private String market;
    private String inputs;
    private String support;

    @OneToMany
    @JoinColumn(name = "COST_ID")
    private Set<Cost> costs = new HashSet<Cost>();

    public Idea(){

    }

    public Idea(String name, String imageUrl, String sector, String size, String description, String process, String market,
            String inputs, String support, Set<Cost> costs) {
        this.name = name;
        this.imageUrl=imageUrl;
        this.sector = sector;
        this.size = size;
        this.description = description;
        this.process = process;
        this.market = market;
        this.inputs = inputs;
        this.support = support;
        this.costs = costs;
    }

  
}