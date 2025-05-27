package Ejercicio2;


import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    ListaDeProductos();
    }

    public static void ListaDeProductos() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Azucar", 3);
        mapa.put("Sal", 2);
        mapa.put("Pan dulce", 6);
        mapa.put("Cafe", 4);

        System.out.println("TreeMap ordenado" + mapa);

        System.out.println("Precio de 'Sal = '" + mapa.get("Sal"));

        String barato = Collections.min(mapa.entrySet(), Map.Entry.comparingByValue()).getKey();
        String Caro = Collections.max(mapa.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("Producto mas caro: " + Caro);
        System.out.println("Producto mas barato: " + barato);


    }
}