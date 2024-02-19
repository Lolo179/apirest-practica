package com.hogwarts.hogwarts.person;

import com.hogwarts.hogwarts.person.port.seconday.database.PersonEntity;
import com.hogwarts.hogwarts.person.port.seconday.database.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService  {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void create(String nombre, int edad){
        if(isUnderAge(edad)){
            throw new BussinessException("No se aceptan menores de 18 años");
        }
        personRepository.save(new PersonEntity(nombre, edad));
    }

    public Person getPersonById(Long id) {
        var personEntity = personRepository.findById(id).orElseThrow(() -> new NotFoundException("The user was not found"));
        return new Person(personEntity.getNombre(),personEntity.getEdad());
    }

    private boolean isUnderAge(int edad){
        return edad < 18;
    }

}


