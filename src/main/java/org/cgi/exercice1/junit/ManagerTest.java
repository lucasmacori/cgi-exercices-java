package org.cgi.exercice1.junit;

import org.cgi.exercice1.Developpeur;
import org.cgi.exercice1.Manager;
import org.cgi.exercice1.Sexe;
import org.cgi.exercice1.Skills;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    @Test
    public void getMembres() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    Sexe.F,
                    new ArrayList<>()
            );

            // Création du développeur 1
            Developpeur developpeur1 = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H,
                    manager,
                    new ArrayList<>()
            );

            // Création du développeur 2
            Developpeur developpeur2 = new Developpeur(
                    "Leconte",
                    "Luc",
                    new SimpleDateFormat("dd-MM-yyyy").parse("30-03-1998"),
                    168,
                    Sexe.H,
                    manager,
                    new ArrayList<>()
            );

            // Ajout des membres au manager
            ArrayList<Developpeur> membres = new ArrayList<>();
            membres.add(developpeur1);
            membres.add(developpeur2);
            manager.setMembres(membres);

            // Test de la fonctionnalité
            assertTrue(manager.getMembres().contains(developpeur1));
            assertTrue(manager.getMembres().contains(developpeur2));
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setMembres() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    Sexe.F,
                    new ArrayList<>()
            );

            // Création du développeur 1
            Developpeur developpeur1 = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H,
                    manager,
                    new ArrayList<>()
            );

            // Création du développeur 2
            Developpeur developpeur2 = new Developpeur(
                    "Leconte",
                    "Luc",
                    new SimpleDateFormat("dd-MM-yyyy").parse("30-03-1998"),
                    168,
                    Sexe.H,
                    manager,
                    new ArrayList<>()
            );

            // Ajout des membres au manager
            ArrayList<Developpeur> membres = new ArrayList<>();
            membres.add(developpeur1);
            membres.add(developpeur2);
            manager.setMembres(membres);

            // Test de la fonctionnalité
            assertTrue(manager.getMembres().contains(developpeur1));
            assertTrue(manager.getMembres().contains(developpeur2));
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void addMembre() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    Sexe.F,
                    new ArrayList<>()
            );

            // Création du développeur 1
            Developpeur developpeur1 = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H,
                    manager,
                    new ArrayList<>()
            );

            // Création du développeur 2
            Developpeur developpeur2 = new Developpeur(
                    "Leconte",
                    "Luc",
                    new SimpleDateFormat("dd-MM-yyyy").parse("30-03-1998"),
                    168,
                    Sexe.H,
                    manager,
                    new ArrayList<>()
            );

            // Création du développeur 3
            Developpeur developpeur3 = new Developpeur(
                    "Rousset",
                    "Sébastien",
                    new SimpleDateFormat("dd-MM-yyyy").parse("31-05-1962"),
                    175,
                    Sexe.H,
                    manager,
                    new ArrayList<>()
            );

            // Ajout des membres au manager
            ArrayList<Developpeur> membres = new ArrayList<>();
            membres.add(developpeur1);
            membres.add(developpeur2);
            manager.setMembres(membres);

            // Test de la fonctionnalité
            manager.addMembre(developpeur3);
            assertTrue(manager.getMembres().contains(developpeur1));
            assertTrue(manager.getMembres().contains(developpeur2));
            assertTrue(manager.getMembres().contains(developpeur3));
        } catch (Exception exception) {
            fail();
        }
    }
}
