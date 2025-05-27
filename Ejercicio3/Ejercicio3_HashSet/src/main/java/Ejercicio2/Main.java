package Ejercicio2;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ListaDePalabras();

    }

    public static void ListaDePalabras() {
        Set<String> Lista = new HashSet<>();

        Lista.add("java".toUpperCase());
        Lista.add("hola".toUpperCase());
        Lista.add("mundo".toUpperCase());
        Lista.add("hola".toUpperCase());



        System.out.println("Contenido de la lista: " + Lista);


    }
}