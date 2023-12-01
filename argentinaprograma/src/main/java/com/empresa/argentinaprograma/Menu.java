package com.empresa.argentinaprograma;

import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1- Agregar Técnico");
        System.out.println("2- Agregar Cliente");
        System.out.println("3- Agregar Incidente");
        System.out.println("4- Agregar Servicio");
        System.out.println("5- Listado de Técnicos");
        System.out.println("6- Listado de Clientes");
        System.out.println("7- Listado de Incidentes");
        System.out.println("8- Listado de Servicios");
        System.out.println("0- Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static int leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}