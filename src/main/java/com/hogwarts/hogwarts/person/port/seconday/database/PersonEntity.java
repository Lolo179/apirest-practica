package com.hogwarts.hogwarts.person.port.seconday.database;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonEntity {

    String nombre;
    int edad;

}
