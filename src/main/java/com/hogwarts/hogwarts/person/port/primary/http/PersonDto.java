package com.hogwarts.hogwarts.person.port.primary.http;

import lombok.Data;

@Data
public class PersonDto {

    public String nombre;
    public int edad;

    public PersonDto(String nombre, int edad) {
    }

}
