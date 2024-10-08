package com.example;

import java.util.ArrayList;
/*# Exercici 0

Implementa els següents objectes en JAVA, fent servir el model de clonació prototype i demostra que funciona correctament:

- Una classe Electrodomèstic amb nom, color, preu, marca, eficiència
- Una classe Rentadora que és un electrodomèstic i a més té: revolucions, soroll
- Una classe Nevera que és un electrodomèstic i a més té: frigories, soroll
- Una classe Forn que és un electrodomèstic i a més té: temperatura, autoneteja

A partir de les classes anteriors, crea una llistes de instàncies per cada
tipus d’electrodomèstic amb almenys 2 elements de cada tipus (Rentadora, Nevera, Forn), inventa’t els valors

Crea després una llista on cada objecte és un clon dels objectes de la llista principal anterior

Fes dos bucles:

- Compara la llista original amb ella mateixa, compara que són el mateix objecte, de la mateixa classe i tenen iguals dades
- Compara la llista original amb dels clons, compara que són objectes diferents, de la mateixa classe i tenen iguals dades

Les comparacions han de ser de cada element amb l’equivalent de l’altre llista (és a dir 1 a 1, no 1 a tots)*/

public class Main {

    static ArrayList<Electrodomestico> electrodomestics = new ArrayList<>();
    static ArrayList<Electrodomestico> electrodomesticsCloned = new ArrayList<>();

    public static void InitLists() {
        electrodomestics.add(new Rentadora("Rentadora 1", "Rojo", 100, "Marca 1", "A+++", 1000, 50));
        electrodomestics.add(new Rentadora("Rentadora 2", "Azul", 200, "Marca 2", "A++", 2000, 60));
        electrodomestics.add(new Nevera("Nevera 1", "Blanco", 300, "Marca 3", "A+", 3000, 70));
        electrodomestics.add(new Nevera("Nevera 2", "Negro", 400, "Marca 4", "A++", 4000, 80));
        electrodomestics.add(new Forn("Forn 1", "Gris", 500, "Marca 5", "A++", 5000, true));
        electrodomestics.add(new Forn("Forn 2", "Negro", 600, "Marca 6", "A+", 6000, false));
    }

    public static void CloneLists() {
        for (Electrodomestico electrodomestico : electrodomestics) {
            electrodomesticsCloned.add(electrodomestico.clone());
        }
    }

    public static void CompareLists() {
        System.out.println("---Comparando con ella misma---");
        for (int i = 0; i < electrodomestics.size(); i++) {
            System.out.println("Comparando los objetos " + i + " de las listas");
            Compare(electrodomestics.get(i), electrodomestics.get(i));
            System.out.println();
        }

        System.out.println("---Comparando con los clones---");
        for (int i = 0; i < electrodomestics.size(); i++) {
            System.out.println("Comparando los objetos " + i + " de las listas");
            Compare(electrodomestics.get(i), electrodomesticsCloned.get(i));
            System.out.println();
        }

    }

    public static void Compare(Electrodomestico electrodomestico1, Electrodomestico electrodomestico2) {
        if (electrodomestico1.equals(electrodomestico2)) {
            System.out.println("    Son el mismo objeto");
        }
        else {
            System.out.println("    No son el mismo objeto");
        }
        if (electrodomestico1.getClass() == electrodomestico2.getClass()) {
            System.out.println("    Son de la misma clase");
        }
        else {
            System.out.println("    No son de la misma clase");
        }
        if (electrodomestico1.SameData(electrodomestico2)) {
            System.out.println("    Tienen los mismos datos");
        }
        else {
            System.out.println("    No tienen los mismos datos");
        }
    }

    public static void main(String[] args) {
        InitLists();
        CloneLists();
        CompareLists();
    }
}
