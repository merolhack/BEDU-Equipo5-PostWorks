package org.bedu.java.backend.postwork8.postwork8.service;

import org.bedu.java.backend.postwork8.postwork8.model.Persona;
import org.bedu.java.backend.postwork8.postwork8.persistence.PersonaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * @author Lenin Meza <merolhack@gmail.com>
 */
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AgendaServiceTests {
    @Mock
    private ValidadorTelefono validadorTelefono;
    @Mock
    private PersonaRepository personaRepository;
    @InjectMocks
    private AgendaServiceImpl agendaService;
    private Persona persona;

    @BeforeEach
    public void setup() {
        // ReflectionTestUtils.setField(agendaService, "validadorTelefono", Mockito.mock(ValidadorTelefono.class));
        // ReflectionTestUtils.setField(agendaService, "PersonaRepository", Mockito.mock(PersonaRepository.class));
        validadorTelefono = Mockito.mock(ValidadorTelefono.class);
        personaRepository = Mockito.mock(PersonaRepository.class);
        agendaService = new AgendaServiceImpl(validadorTelefono, personaRepository);
        persona = Persona.builder()
                .id(1L)
                .nombre("Lenin Meza")
                .telefono("5555555555")
                .build();
        System.out.println(persona);
    }

    /**
     * Prueba unitaria para validar el método guardaPersona
     */
    @DisplayName("Prueba unitaria para validar el método guardaPersona")
    @Test
    public void givenPersonaObject_whenGuardaPersona_thenReturnPersonaObject() {
        // given - precondition or setup
        given(personaRepository.findById(persona.getId()))
                .willReturn(Optional.empty());

        given(personaRepository.save(persona)).willReturn(persona);

        System.out.println(personaRepository);
        System.out.println(agendaService);

        // when -  action or the behaviour that we are going test
        Persona savedEmployee = agendaService.guardaPersona(persona);

        System.out.println(savedEmployee);
        // then - verify the output
        assertThat(savedEmployee).isNotNull();
    }

    /**
     *
     */
    @DisplayName("Prueba unitaria para validar el método getPersonas")
    @Test
    public void givenPersonaList_whenGetPersonas_thenReturnPersonaList() {
        // when -  action or the behaviour that we are going test
        List<Persona> personas = agendaService.getPersonas();

        System.out.println(personas);
        // then - verify the output
        assertThat(personas).isNotNull();
    }
}
