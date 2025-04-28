package com.Saiyajin.service;

import com.Saiyajin.model.Saiyajin;
import com.Saiyajin.repository.SaiyajinRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaiyajinService {
    @Autowired
    private SaiyajinRepository saiyajinRepository;

    public List<Saiyajin> obtenerSaiyajin() {
        return saiyajinRepository.obtenerSaiyajin();
    }

    public Saiyajin guardar(Saiyajin saiyajin) {
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