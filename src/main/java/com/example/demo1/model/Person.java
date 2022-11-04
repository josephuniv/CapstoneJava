package com.example.demo1.model;

import java.util.UUID;

public class Person {
    private final int id; //UUID id;
    private final String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
