package org.cgi.exercice1;

import java.util.Date;

/**
 * @author lucas
 * @version 1.0
 */
public class Personne {
    /**
     * Sexe de la personne
     * Peut-être un homme ou une femme
     */
    protected Sexe sexe;

    /**
     * Nom de la personne
     */
    protected String nom;
    /**
     * Prénom de la personne
     */
    protected String prenom;
    /**
     * Date de naissance de la personne
     */
    protected Date dateNaissance;
    /**
     * Taille de la personne
     */
    protected int taille;

    public Personne(String nom, String prenom, Date dateNaissance, int taille, Sexe sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }
}
