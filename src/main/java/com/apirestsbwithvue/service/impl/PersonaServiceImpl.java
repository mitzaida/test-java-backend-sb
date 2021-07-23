package com.apirestsbwithvue.service.impl;

import com.apirestsbwithvue.dao.api.commons.GenericServiceImpl;
import com.apirestsbwithvue.dao.api.PersonaDaoAPI;
import com.apirestsbwithvue.model.Persona;
import com.apirestsbwithvue.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {

    @Autowired
    private PersonaDaoAPI personaDaoAPI;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaDaoAPI;
    }
}
