package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    AgregarUsuarios();

    }

    public static void AgregarUsuarios() {
        Set<String> usuarios = new HashSet<>();

        usuarios.add("Herbert");
        usuarios.add("Ivan");
        usuarios.add("Amilcar");
        usuarios.add("Ivan");
        usuarios.add("Keny");

        System.out.println("Contenido de la lista de usuarios: " + usuarios);

        System.out.println("Contiene 'Ivan'? " + usuarios.contains("Ivan"));

    }
}