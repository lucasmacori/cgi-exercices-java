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
    private enum sexe { M, F }

    /**
     * Nom de la personne
     */
    private String nom;
    /**
     * Prénom de la personne
     */
    private String prenom;
    /**
     * Date de naissance de la personne
     */
    private Date dateNaissance;
    /**
     * Taille de la personne
     */
    private int taille;

    public Personne(String nom, String prenom, Date dateNaissance, int taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
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
}