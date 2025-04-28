package com.Saiyajin.Saiyajin.Repository;


import org.springframework.stereotype.Repository;

import com.Saiyajin.Saiyajin.Model.Saiyajin;

import java.util.ArrayList;
import java.util.List;

@Repository 


public class SaiyajinRepository {

    private List<Saiyajin> ListSaiyajin = new ArrayList<>();

    public SaiyajinRepository() {
        ListSaiyajin.add(new Saiyajin(1, "Goku"));
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

    public Saiyajin guardar(Saiyajin saiyan){
        Saiyajin saiyajin = new Saiyajin();
        saiyajin.setId(saiyan.getId());
        saiyajin.setNombre(saiyan.getNombre());

        


        ListSaiyajin.add(saiyan);
        return saiyan;
    }

    public Saiyajin actualizar(Saiyajin saiyan) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < ListSaiyajin.size(); i++){
            if (ListSaiyajin.get(i).getId() == saiyan.getId()){
                id = saiyan.getId();
                idPosicion = i; 

            }

        }
            Saiyajin Saiyajin1 = new Saiyajin();
            Saiyajin1.setId(id);
            Saiyajin1.setNombre(saiyan.getNombre());

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
