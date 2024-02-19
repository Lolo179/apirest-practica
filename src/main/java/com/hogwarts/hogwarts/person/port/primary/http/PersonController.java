package com.hogwarts.hogwarts.person.port.primary.http;

import com.hogwarts.hogwarts.person.PersonService;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class PersonController {

    private final PersonService personService;
    private final ConversionService conversionService;

    public PersonController(PersonService personService, ConversionService conversionService) {
        this.personService = personService;
        this.conversionService = conversionService;
    }

    @PostMapping("/person")
    public ResponseEntity<?> create(PersonDto personDto) {
        personService.create(personDto.getNombre(),personDto.getEdad());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<PersonDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(
                conversionService.convert(personService.getPersonById(id), PersonDto.class)
        );
    }

}
