package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio) {
        if (audio.getClasificacion() >= 7){
            System.out.println(audio.getTitulo() + "n Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + "n También es uno de los favoritos");
        }


    }

}
