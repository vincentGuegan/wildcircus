package com.checkpoint4.wildcircus.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Spectacle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToMany(mappedBy = "subscribedSpectacles")
    Set<Person> subscribes;

    public Spectacle() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
		this.description = description;
    }

    public Set<Person> getSubscribes() {
        return subscribes;
    }

    public void setSubscribes(Set<Person> subscribes) {
        this.subscribes = subscribes;
    }
}