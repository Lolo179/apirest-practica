package com.hogwarts.hogwarts.person.port.seconday.database;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity,Long>, CustomizedPersonRepository{

}
