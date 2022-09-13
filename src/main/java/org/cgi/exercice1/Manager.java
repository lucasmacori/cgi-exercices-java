package org.cgi.exercice1;


import java.util.ArrayList;
import java.util.Date;

public class Manager extends Personne {
    /**
     * Les membres managés par le manager
     */
    private ArrayList<Developpeur> membres;

    public Manager(String nom, String prenom, Date dateNaissance, int taille, ArrayList<Developpeur> membres) {
        super(nom, prenom, dateNaissance, taille);
        this.membres = membres;
    }

    public ArrayList<Developpeur> getMembres() {
        return membres;
    }

    public void setMembres(ArrayList<Developpeur> membres) {
        this.membres = membres;
    }

    /**
     * Ajoute un membre managé au manager
     * @param membre le nouveau membre à ajouter au manager
     */
    public void addMembre(Developpeur membre) {
        // TODO : Implémenter la méthode une fois les tests unitaires dévelopés et exécutés
        throw new UnsupportedOperationException();
    }
}