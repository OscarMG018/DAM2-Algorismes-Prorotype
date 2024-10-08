package com.example;

public class Nevera extends Electrodomestico {
    private int frigories;
    private int soroll;

    public Nevera(String nom, String color, double preu, String marca, String eficiencia, int frigories, int soroll) {
        super(nom, color, preu, marca, eficiencia);
        this.frigories = frigories;
        this.soroll = soroll;
    }

    @Override
    public Nevera clone() {
        return new Nevera(this.getNom(), this.getColor(), this.getPreu(), this.getMarca(), this.getEficiencia(), this.frigories, this.soroll);
    }

    @Override
    public boolean SameData(Electrodomestico electrodomestico) {
        return electrodomestico instanceof Nevera &&
        super.SameData(electrodomestico) &&
        this.frigories == ((Nevera) electrodomestico).getFrigories() &&
        this.soroll == ((Nevera) electrodomestico).getSoroll();
    }

    public int getFrigories() {
        return frigories;
    }

    public void setFrigories(int frigories) {
        this.frigories = frigories;
    }
    
    public int getSoroll() {
        return soroll;
    }

    public void setSoroll(int soroll) {
        this.soroll = soroll;
    }
}
