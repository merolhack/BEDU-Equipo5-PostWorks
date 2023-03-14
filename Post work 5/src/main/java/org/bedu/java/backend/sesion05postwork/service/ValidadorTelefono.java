package org.bedu.java.backend.sesion05postwork.service;

import org.springframework.stereotype.Service;

@Service
public class ValidadorTelefono {
    public boolean isValido(String telefono) {
        return true;
    }

    public String limpiaNumero(String telefono){
        return telefono;
    }
}
