package main;

import main.model.*;

public class ValidadorDeCorreo {

    private Manejador inicial;

    public ValidadorDeCorreo() {
        this.inicial = new ManejadorGerencia();
        Manejador comercial = new ManejadorComercial();
        Manejador tecnico = new ManejadorSoporteIT();
        Manejador spam = new ManejadorSpam();

        inicial.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(spam);
    }

    public String comprobar(Correo correo) {
        return inicial.comprobar(correo);
    }
}
