package org.bedu.java.backend.postwork8.postwork8.persistence;

import org.bedu.java.backend.postwork8.postwork8.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
