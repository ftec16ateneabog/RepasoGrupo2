package com.atenea.repaso;

import android.util.Patterns;

public class Security {
    public static boolean validarSize(String textoAValidar, int min, int max)
    {
        return textoAValidar.length() >= min && textoAValidar.length() <= max;
    }
    public static boolean validarTelefono(String tel){
        return Patterns.PHONE.matcher(tel).matches();
    }

    public static boolean validarMail(String tel){
        return Patterns.EMAIL_ADDRESS.matcher(tel).matches();
    }

    public static boolean validarTexto(String texto)
    {
        return texto.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

}
