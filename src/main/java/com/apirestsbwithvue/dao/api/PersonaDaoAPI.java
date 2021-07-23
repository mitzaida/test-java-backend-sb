package com.apirestsbwithvue.dao.api;

import com.apirestsbwithvue.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
