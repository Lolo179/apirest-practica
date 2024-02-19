package com.hogwarts.hogwarts.person;

import lombok.Data;

@Data
public class Person {

    String nombre;
    int edad;

    public Person(String nombre, int edad) {
    }
}
