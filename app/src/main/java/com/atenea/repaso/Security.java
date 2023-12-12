package com.atenea.repaso;

public class Security {
    public static boolean validarSize(String textoAValidar, int min, int max)
    {
        return textoAValidar.length() >= min && textoAValidar.length() <= max;
    }
}
