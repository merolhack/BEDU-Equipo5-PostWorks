package org.bedu.java.backend.postwork8.postwork8.service;

import org.bedu.java.backend.postwork8.postwork8.model.Persona;
import org.bedu.java.backend.postwork8.postwork8.persistence.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AgendaService {

    private final ValidadorTelefono validadorTelefono;
    private final PersonaRepository personarepository;

    @Autowired
    public AgendaService(ValidadorTelefono validadorTelefono, AgendaMemoryDao personarepository) {
        this.validadorTelefono = validadorTelefono;
        this.personarepository = personarepository;
    }

    public Persona guardaPersona(Persona persona) {
        String telefono = validadorTelefono.limpiaNumero(persona.getTelefono());

        persona.setTelefono(telefono);

        return this.personarepository.save(persona);
    }

    public List<Persona> getPersonas() {
        return this.personarepository.findAll(Sort.by("nombre")) ;
    }
}
