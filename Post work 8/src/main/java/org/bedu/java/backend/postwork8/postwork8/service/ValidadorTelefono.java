package org.bedu.java.backend.postwork8.postwork8.service;

import org.springframework.stereotype.Service;
import java.util.regex.Pattern;

@Service
public class ValidadorTelefono {
    private final Pattern PATTERN_TELEFONO;

    public ValidadorTelefono() {
        String patronTel ="\\d{10}";                             // 10 digitos
        patronTel+="|(?:\\d{3}[- .]?){2}\\d{4}";                 // ### ### ####
        patronTel+="|(?:\\d{4}[- .]?)(?:\\d{2}[- .]?){2}\\d{2}"; // #### ## ## ##  (patron muy usado en yucatan)
        patronTel+="|^(\\d{2,4}[- .]?){2}\\d{4}$";               // ## #### ####  Propuesto por BEDU
        this.PATTERN_TELEFONO = Pattern.compile(patronTel);
    }
    public boolean isValido(String telefono) {
        return PATTERN_TELEFONO.matcher(telefono).matches();
    }


    public String limpiaNumero(String telefono) {
        return telefono.replaceAll("[^0-9]", "");
    }
}
