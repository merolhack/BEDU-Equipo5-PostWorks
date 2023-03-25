package org.bedu.java.backend.postwork8.postwork8.controller;

import org.bedu.java.backend.postwork8.postwork8.model.Persona;
import org.bedu.java.backend.postwork8.postwork8.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class AgendaController {

    private final AgendaService agendaService;


    @Autowired
    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model) {
        model.addAttribute("persona", new Persona());
        model.addAttribute("listaPersonas", agendaService.getPersonas());

        return "index";
    }

    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona, BindingResult result, Model model) {

       if (agendaService.validaTelefono(persona) )
        agendaService.guardaPersona(persona);
        else {
            ObjectError error = new ObjectError("globalError", "agendaService reporta: Telefono invalido");
            result.addError(error);
        }

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listaPersonas", agendaService.getPersonas());
        return mav;
    }

}
