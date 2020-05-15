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

@Entity
public class Idea implements Serializable {
    private static final long serialVersionUID = 1L;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getInputs() {
        return inputs;
    }

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public Set<Cost> getCosts() {
        return costs;
    }

    public void setCosts(Set<Cost> costs) {
        this.costs = costs;
    }

    

  
}