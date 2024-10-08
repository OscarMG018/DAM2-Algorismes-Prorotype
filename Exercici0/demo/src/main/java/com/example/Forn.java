package com.example;


public class Forn extends Electrodomestico {
    private int temperatura;
    private boolean autoneteja;

    public Forn(String nom, String color, double preu, String marca, String eficiencia, int temperatura, boolean autoneteja) {
        super(nom, color, preu, marca, eficiencia);
        this.temperatura = temperatura;
        this.autoneteja = autoneteja;
    }

    @Override
    public Forn clone() {
        return new Forn(this.getNom(), this.getColor(), this.getPreu(), this.getMarca(), this.getEficiencia(), this.temperatura, this.autoneteja);
    }

    @Override
    public boolean SameData(Electrodomestico electrodomestico) {
        return electrodomestico instanceof Forn &&
        super.SameData(electrodomestico) &&
        this.temperatura == ((Forn) electrodomestico).getTemperatura() &&
        this.autoneteja == ((Forn) electrodomestico).isAutoneteja();
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isAutoneteja() {
        return autoneteja;
    }

    public void setAutoneteja(boolean autoneteja) {
        this.autoneteja = autoneteja;
    }
}