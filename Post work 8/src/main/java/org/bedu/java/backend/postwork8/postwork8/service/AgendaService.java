package org.bedu.java.backend.postwork8.postwork8.service;

import org.bedu.java.backend.postwork8.postwork8.model.Persona;

import java.util.List;

public interface AgendaService {
    Persona guardaPersona(Persona persona);

    List<Persona> getPersonas();
}
