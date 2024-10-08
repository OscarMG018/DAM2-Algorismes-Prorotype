package com.example;

public class Rentadora extends Electrodomestico {
    private int revolucions;
    private int soroll;

    public Rentadora(String nom, String color, double preu, String marca, String eficiencia, int revolucions, int soroll) {
        super(nom, color, preu, marca, eficiencia);
        this.revolucions = revolucions;
        this.soroll = soroll;
    }

    @Override
    public Rentadora clone() {
        return new Rentadora(this.getNom(), this.getColor(), this.getPreu(), this.getMarca(), this.getEficiencia(), this.revolucions, this.soroll);
    }

    @Override
    public boolean SameData(Electrodomestico electrodomestico) {
        return electrodomestico instanceof Rentadora &&
        super.SameData(electrodomestico) &&
        this.revolucions == ((Rentadora) electrodomestico).getRevolucions() &&
        this.soroll == ((Rentadora) electrodomestico).getSoroll();
    }

    public int getRevolucions() {
        return revolucions;
    }

    public void setRevolucions(int revolucions) {
        this.revolucions = revolucions;
    }

    public int getSoroll() {
        return soroll;
    }

    public void setSoroll(int soroll) {
        this.soroll = soroll;
    }
}