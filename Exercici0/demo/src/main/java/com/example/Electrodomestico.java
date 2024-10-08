package com.example;

public class Electrodomestico implements Cloneable {
    private String nom;
    private String color;
    private double preu;
    private String marca;
    private String eficiencia;

    public Electrodomestico(String nom, String color, double preu, String marca, String eficiencia) {
        this.nom = nom;
        this.color = color;
        this.preu = preu;
        this.marca = marca;
        this.eficiencia = eficiencia;
    }

    @Override
    public Electrodomestico clone() {
        return new Electrodomestico(this.nom, this.color, this.preu, this.marca, this.eficiencia);
    }

    public boolean SameData(Electrodomestico electrodomestico) {
        return this.nom == electrodomestico.getNom() &&
        this.color == electrodomestico.getColor() &&
        this.preu == electrodomestico.getPreu() &&
        this.marca == electrodomestico.getMarca() &&
        this.eficiencia == electrodomestico.getEficiencia();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
}