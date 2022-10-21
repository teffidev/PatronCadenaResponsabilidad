package main.model;

import main.Manejador;

public class ManejadorComercial extends Manejador {

    public ManejadorComercial() {
        this.direccionDeCorreoAsignada = "comercial@comisionseis.com";
        this.asuntoPorAtender = "comercial";
    }

    @Override
    public String comprobar(Correo email) {
        String mensaje = "";

        if (this.esValidoElCorreo(email)) {
            mensaje = "Enviado a comercial";
        } else {
            if (this.getSiguienteManejador() != null) {
                // Pasamos el mensaje al siguiente responsable si lo hubiere
                mensaje = this.getSiguienteManejador().comprobar(email);
            }
        }
        return mensaje;
    }
}
