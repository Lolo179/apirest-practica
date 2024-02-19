package com.hogwarts.hogwarts.person.port.primary.http;


import com.hogwarts.hogwarts.person.Person;
import org.springframework.core.convert.converter.Converter;

public class PersonToPersonDtoConverter implements Converter<Person, PersonDto> {

    @Override
    public PersonDto convert(Person person) {
        return new PersonDto(person.getNombre(),person.getEdad());
    }

}
