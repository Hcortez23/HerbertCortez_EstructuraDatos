package Ejercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int opcion;

    public static void main(String[] args) {

        SistemaDeCodigos();
    }

    public static void SistemaDeCodigos() {
        Scanner scanner = new Scanner(System.in);
        Set<String> codigos = new HashSet<>();
        do {
            System.out.println("----Bienvenido al evento----");
            System.out.println("1. Escanear Codigo");
            System.out.println("2. Mostrar Lista");
            System.out.println("3. Salir del sistema");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Ingrese su codigo de invitado");
                    String codigo = sc.nextLine();

                    if (codigos.contains(codigo)) {
                        System.out.println("Codigo ya existente dentro de la lista");
                    } else {
                        codigos.add(codigo);
                        System.out.println("Asistente agregado correctamente");
                    }
                    break;
                case 2:
                    System.out.println("Lista de asistentes: " + codigos);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema!");
            }
        } while (opcion != 3);


    }
}