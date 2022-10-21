package main.model;

import main.Manejador;

public class ManejadorSoporteIT extends Manejador {

    public ManejadorSoporteIT(){
        this.direccionDeCorreoAsignada = "soporte@headingsas.com";
        this.asuntoPorAtender = "soporte técnico";
    }

    @Override
    public String comprobar(Correo email) {
        String mensaje = "";

        if(this.esValidoElCorreo(email)){
            mensaje = "Envio a soporte IT.";
        }
        else {
            if(this.getSiguienteManejador() != null) {
                // Pasamos el mensaje al siguiente responsable
                mensaje = this.getSiguienteManejador().comprobar(email);
            }
        }
        return mensaje;
    }

}
