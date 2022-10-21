package main.model;

import main.Manejador;

public class ManejadorGerencia extends Manejador {


    public ManejadorGerencia() {
        this.direccionDeCorreoAsignada = "gerencia@comosionseis.com";
        this.asuntoPorAtender = "La comision más copada";
    }



    @Override
    public String comprobar(Correo correo) {

        String mensaje = "";

        if(esValidoElCorreo(correo)) {
            mensaje = "Procesado por gerencia";
        } else {
            if (this.getSiguienteManejador() != null) {
                mensaje = this.getSiguienteManejador().comprobar(correo);
            }
        }
        return mensaje;
    }

}
