package com.company;

abstract class Commercial extends employe {
    private double chiffreAffaire;

    public Commercial(String prenom, String nom, int age, String date,
                      double chiffreAffaire) {
        super(prenom, nom, age, date);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire()
    {
        return chiffreAffaire;
    }

}