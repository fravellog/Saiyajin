package com.Saiyajin.repository;


import org.springframework.stereotype.Repository;
import com.Saiyajin.model.Saiyajin;

import java.util.ArrayList;
import java.util.List;

@Repository 
public class SaiyajinRepository {

    private List<Saiyajin> ListaSaiyajin = new ArrayList<>();

    public SaiyajinRepository() {
        ListaSaiyajin.add(new Saiyajin(1, "Goku", true, "humano", 1 ));
    }

    public List<Saiyajin> obtenerSaiyajin() {
        return ListaSaiyajin;
    }

    public Saiyajin Buscarporid(int id) {
        for (Saiyajin saiyajin: ListaSaiyajin){
            if (saiyajin.getId() == id ){
                return saiyajin;
            }
        }   
        return null;
    }

    public Saiyajin guardar(Saiyajin saiyajin){
        ListaSaiyajin.add(saiyajin);
        return saiyajin;
    }

    public Saiyajin actualizar(Saiyajin saiyajin) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < ListaSaiyajin.size(); i++){
            if (ListaSaiyajin.get(i).getId() == saiyajin.getId()){
                id = saiyajin.getId();
                idPosicion = i; 
            }

        }
            Saiyajin Saiyajin1 = new Saiyajin();
            Saiyajin1.setId(id);
            Saiyajin1.setNombre(saiyajin.getNombre());

            ListaSaiyajin.set(idPosicion, Saiyajin1);
            return Saiyajin1;
    }
    public void eliminar(int id){

       Saiyajin saiyan = Buscarporid(id);
       if (saiyan != null) {
        ListaSaiyajin.remove(saiyan);
       } 
       ListaSaiyajin.removeIf(x -> x.getId() == id);
    }
    public int totalSaiyan(){
        return ListaSaiyajin.size();
    }


}
