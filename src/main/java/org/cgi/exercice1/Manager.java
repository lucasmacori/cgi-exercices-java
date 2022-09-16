package org.cgi.exercice1;


import java.util.ArrayList;
import java.util.Date;

public class Manager extends Personne {
    /**
     * Les membres managés par le manager
     */
    private ArrayList<Developpeur> membres;

    public Manager(String nom, String prenom, Date dateNaissance, int taille, Sexe sexe, ArrayList<Developpeur> membres) {
        super(nom, prenom, dateNaissance, taille, sexe);
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
        if (this.membres == null) {
            this.membres = new ArrayList<>();
        }
        this.membres.add(membre);
    }
}
