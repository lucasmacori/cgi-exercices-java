package org.cgi.exercice1;

import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Developpeur extends Personne {
    /**
     * La manager du développeur
     */
    private Manager manager;
    /**
     * Les compétences du développeur
     */
    private ArrayList<Skills> skills;

    public Developpeur(String nom, String prenom, Date dateNaissance, int taille, Sexe sexe, Manager manager, ArrayList<Skills> skills) {
        super(nom, prenom, dateNaissance, taille, sexe);
        this.manager = manager;
        this.skills = skills;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }

    /**
     * Calcul l'age du développeur grâce à la date de naissance
     * @return L'age du développeur
     */
    public int getAge() {
        return Period.between(
                this.dateNaissance.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
        ).getYears();
    }

    /**
     * Ajoute des compétences aux compétences actuelles du développeur
     * @param newSkills les nouveaux skills à ajouter au développeur
     */
    public void addSkills(ArrayList<Skills> newSkills) {
        if (this.skills == null) {
            this.skills = new ArrayList<>();
        }
        this.skills.addAll(newSkills);
    }

    @Override
    public String toString() {
        return super.toString() + " (Manager : " + this.manager.toString() + ") ";
    }
}
