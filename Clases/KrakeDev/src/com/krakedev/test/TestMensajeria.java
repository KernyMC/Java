package com.krakedev.test;

import com.krakedev.Mensajeria;

public class TestMensajeria {
    
    public static void main(String[] args) {
        Mensajeria mensajeria;
        mensajeria = new Mensajeria();
        mensajeria.saludar();
        mensajeria.saludarAmigo("Juan", "Perez");

    }
}
