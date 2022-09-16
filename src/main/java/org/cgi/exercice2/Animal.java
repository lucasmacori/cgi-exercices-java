package org.cgi.exercice2;

public abstract class Animal {
    protected int age;
    protected String nom;
    protected String son;
    protected int nbPattes;
    protected Sexe sexe;

    public Animal(int age, String nom, String son, int nbPattes, Sexe sexe) {
        this.age = age;
        this.nom = nom;
        this.son = son;
        this.nbPattes = nbPattes;
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSon() {
        return son;
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return this.nom + " - "
                + this.age + " - "
                + (this.age * this.nbPattes) + this.sexe.toString().charAt(0) + " - "
                + this.son;
    }
}
