package org.cgi.exercice1.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.cgi.exercice1.Personne;
import org.cgi.exercice1.Sexe;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonneTest {
    @Test
    public void getNom() {
        try {
            // Création de la personne
            Personne personne = new Personne(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H
            );

            // Test de la fonctionnalité
            assertEquals("Dupont", personne.getNom());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setNom() {
        try {
            // Création de la personne
            Personne personne = new Personne(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H
            );

            // Test de la fonctionnalité
            personne.setNom("Durand");
            assertEquals("Durand", personne.getNom());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getPrenom() {
        try {
            // Création de la personne
            Personne personne = new Personne(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H
            );

            // Test de la fonctionnalité
            assertEquals("Jean", personne.getPrenom());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setPrenom() {
        try {
            // Création de la personne
            Personne personne = new Personne(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H
            );

            // Test de la fonctionnalité
            personne.setPrenom("Michel");
            assertEquals("Michel", personne.getPrenom());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getDateNaissance() {
        try {
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975");

            // Création de la personne
            Personne personne = new Personne(
                    "Dupont",
                    "Jean",
                    date,
                    178,
                    Sexe.H
            );

            // Test de la fonctionnalité
            assertEquals(date, personne.getDateNaissance());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setDateNaissance() {
        try {
            // Création de la personne
            Personne personne = new Personne(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H
            );

            // Test de la fonctionnalité
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse("09-05-1980");
            personne.setDateNaissance(date);
            assertEquals(date, personne.getDateNaissance());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getTaille() {
        try {
            // Création de la personne
            Personne personne = new Personne(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H
            );

            // Test de la fonctionnalité
            assertEquals(178, personne.getTaille());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setTaille() {
        try {
            // Création de la personne
            Personne personne = new Personne(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    Sexe.H
            );

            // Test de la fonctionnalité
            personne.setTaille(190);
            assertEquals(190, personne.getTaille());
        } catch (Exception exception) {
            fail();
        }
    }
}
