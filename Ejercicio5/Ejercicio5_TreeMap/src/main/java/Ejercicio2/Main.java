package Ejercicio2;


import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    ListaDeCiudades();
    }


    public static void ListaDeCiudades() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("San Salvador", 30);
        mapa.put("Santa Ana", 28);
        mapa.put("Chalatenango", 25);
        mapa.put("San Miguel", 32);

        System.out.println("TreeMap ordenado" + mapa);



        String fria = Collections.min(mapa.entrySet(), Map.Entry.comparingByValue()).getKey();
        String calurosa = Collections.max(mapa.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("Ciudad mas fria: " + fria);
        System.out.println("Ciudad mas calurosa " + calurosa);


    }
}