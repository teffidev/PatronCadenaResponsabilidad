package main;

import main.model.Correo;

public abstract class Manejador {

    public String direccionDeCorreoAsignada;
    public String asuntoPorAtender;

    public Manejador siguienteManejador;

    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract String comprobar(Correo correo);

    public boolean esValidoElCorreo(Correo correo) {
        return correo.getDestino().equals(this.direccionDeCorreoAsignada) ||
                correo.getAsunto().equalsIgnoreCase(this.asuntoPorAtender);
    }

}
