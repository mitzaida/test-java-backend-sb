package com.apirestsbwithvue.controller;

import com.apirestsbwithvue.model.Persona;
import com.apirestsbwithvue.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin("*")
public class PersonaRestController {

    @Autowired
    private PersonaServiceAPI personaServiceAPI;

    @GetMapping(value = "/all")
    public List<Persona> getAll() {
        return personaServiceAPI.getAll();
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona) {
        Persona obj = personaServiceAPI.save(persona);
        return new ResponseEntity<Persona>(obj, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Persona> delete(@PathVariable Long id) {
        Persona persona = personaServiceAPI.get(id);
        if (persona != null) {
            personaServiceAPI.delete(id);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

} // Fin PersonaRestController
