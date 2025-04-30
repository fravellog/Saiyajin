package com.Saiyajin.Saiyajin.controller;

import com.Saiyajin.Saiyajin.model.Saiyajin;
import com.Saiyajin.Saiyajin.service.SaiyajinService;

/* Importamos Anotaciones necesarias de Spring */
import org.springframework.beans.factory.annotation.Autowired; /* Para importar dependencias automaticamente  */
import org.springframework.web.bind.annotation.*; /* Esto importa todas las Anotaciones */

/* Para manejar listas */
import java.util.List;

@RestController
@RequestMapping("/api/v1/Saiyajin")
public class SaiyajinController {

    @Autowired
    private SaiyajinService saiyajinService;

    @GetMapping
    public List<Saiyajin> listaSaiyajins(){
        return saiyajinService.getSaiyajins(); /* Corregi algo super pequeño aqui antes salia "getSaiyajin" */
    }

    @PostMapping
    public Saiyajin agregarSaiyajin(@RequestBody Saiyajin saiyajin) {
        return saiyajinService.saveSaiyajin(saiyajin);
    }
    
    @GetMapping("/{id}")
    public Saiyajin buscarSaiyajin(@PathVariable int id) {
        return saiyajinService.getSaiyajin(id);
    }

    @PutMapping("/{id}")
    public Saiyajin actualizarSaiyajin(@PathVariable int id, @RequestBody Saiyajin saiyajin) {
        return saiyajinService.updateSaiyajin(id, saiyajin);
    }
    
    @DeleteMapping("/{id}")
    public String eliminarSaiyajin(@PathVariable int id){
        return saiyajinService.deleteSaiyajin(id);
    }
}
