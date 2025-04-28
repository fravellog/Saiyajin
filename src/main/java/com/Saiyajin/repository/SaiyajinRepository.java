package com.Saiyajin.repository;


import org.springframework.stereotype.Repository;
import com.Saiyajin.model.Saiyajin;

import java.util.ArrayList;
import java.util.List;

@Repository 
public class SaiyajinRepository {

    private List<Saiyajin> ListSaiyajin = new ArrayList<>();

    public SaiyajinRepository() {
        ListSaiyajin.add(new Saiyajin(1, "Goku", true, "humano", 1 ));
    }

    public List<Saiyajin> obtenerSaiyajin() {
        return ListSaiyajin;
    }

    public Saiyajin Buscarporid(int id) {
        for (Saiyajin saiyajin: ListSaiyajin){
            if (saiyajin.getId() == id ){
                return saiyajin;
            }
        }   
        return null;
    }

    public Saiyajin guardar(Saiyajin saiyajin){
        Saiyajin saiyajin1 = new Saiyajin();
        saiyajin.setId(saiyajin.getId());
        saiyajin.setNombre(saiyajin.getNombre());
        ListSaiyajin.add(saiyajin);
        return saiyajin;
    }

    public Saiyajin actualizar(Saiyajin saiyajin) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < ListSaiyajin.size(); i++){
            if (ListSaiyajin.get(i).getId() == saiyajin.getId()){
                id = saiyajin.getId();
                idPosicion = i; 
            }

        }
            Saiyajin Saiyajin1 = new Saiyajin();
            Saiyajin1.setId(id);
            Saiyajin1.setNombre(saiyajin.getNombre());

            ListSaiyajin.set(idPosicion, Saiyajin1);
            return Saiyajin1;
    }
    public void eliminar(int id){

       Saiyajin saiyan = Buscarporid(id);
       if (saiyan != null) {
        ListSaiyajin.remove(saiyan);
       } 
       ListSaiyajin.removeIf(x -> x.getId() == id);
    }
    public int totalSaiyan(){
        return ListSaiyajin.size();
    }


}
