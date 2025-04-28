package service;

package com.Saiyajin.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class SaiyajinService {
    @Autowired
    private SaiyajinRepository saiyajinRepository;

     public List<Saiyajin> getSaiyajins() {
        return saiyajinRepository.obtenerSaiyajin();
    }

     public Saiyajin saveSaiyajin(Saiyajin saiyajin) {
        saiyajinRepository.guardar(saiyajin);
    }

    public Saiyajin getSaiyajinId(int id) {
        return saiyajinRepository.buscarPorId(id);
    }
    public Saiyajin updateSaiyajin(Saiyajin saiyajin) {
        return saiyajinRepository.actualizar(saiyajin);
    }
    public void deleteSaiyajin(int id) {
        saiyajinRepository.eliminar(id);
        return "saiyajin eliminado";
    }
}