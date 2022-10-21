package main;

import main.model.Correo;

public class Main {
    public static void main(String[] args) {

        ValidadorDeCorreo proceso1 = new ValidadorDeCorreo();

        Correo correo1 = new Correo("andyDh@enclase.com", "gerencia@comisionseis.com",
                "La comision más copada");

        String resultado = proceso1.comprobar(correo1);

        System.out.println(resultado);

    }
}
