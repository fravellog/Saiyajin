package com.Saiyajin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Saiyajin {
    private int id;
    private String nombre;
    private Boolean bando;
    private String raza;
    private int nivel;
}
