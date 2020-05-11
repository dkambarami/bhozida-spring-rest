package com.bhozida.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Idea implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String name;
    private String imageUrl;
    private String sector;
    private String size;
    @Column(columnDefinition = "LONGTEXT")
    private String description;
    private String process;
    @Column(columnDefinition = "LONGTEXT")
    private String market;
    @Column(columnDefinition = "LONGTEXT")
    private String inputs;
    @Column(columnDefinition = "LONGTEXT")
    private String support;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "COST_ID")
    private Set<Cost> costs = new HashSet<Cost>();

    public Idea(){

    }

    public Idea(String name, String imageUrl, String sector, String size, String description, String process, String market,
            String inputs, String support) {
        this.name = name;
        this.imageUrl=imageUrl;
        this.sector = sector;
        this.size = size;
        this.description = description;
        this.process = process;
        this.market = market;
        this.inputs = inputs;
        this.support = support;
    }

  
}