package main.model;

import main.Manejador;

public class ManejadorSpam extends Manejador {

    @Override
    public String comprobar(Correo email){
        return "¡Ojo! Marcado como spam....";
    }
}
