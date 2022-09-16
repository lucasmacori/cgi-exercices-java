package org.cgi.exercice2.junit;

import org.cgi.exercice1.Developpeur;
import org.cgi.exercice1.Manager;
import org.cgi.exercice2.Chien;
import org.cgi.exercice2.Sexe;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ChienTest {
    @Test
    public void getAge() {
        try {
            // Création du chien
            Chien chien = new Chien(
                    15,
                    "Toto",
                    org.cgi.exercice2.Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals(15, chien.getAge());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setAge() {
        try {
            // Création du chien
            Chien chien = new Chien(
                    15,
                    "Toto",
                    org.cgi.exercice2.Sexe.Male
            );

            // Test de la fonctionnalité
            chien.setAge(6);
            assertEquals(6, chien.getAge());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getNom() {
        try {
            // Création du chien
            Chien chien = new Chien(
                    15,
                    "Toto",
                    org.cgi.exercice2.Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals("Toto", chien.getNom());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setNom() {
        try {
            // Création du chien
            Chien chien = new Chien(
                    15,
                    "Toto",
                    org.cgi.exercice2.Sexe.Male
            );

            // Test de la fonctionnalité
            chien.setNom("Titi");
            assertEquals("Titi", chien.getNom());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getSon() {
        try {
            // Création du chien
            Chien chien = new Chien(
                    15,
                    "Toto",
                    org.cgi.exercice2.Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals("Wouaf", chien.getSon());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getNbPattes() {
        try {
            // Création du chien
            Chien chien = new Chien(
                    15,
                    "Toto",
                    org.cgi.exercice2.Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals(4, chien.getNbPattes());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getSexe() {
        try {
            // Création du chien
            Chien chien = new Chien(
                    15,
                    "Toto",
                    org.cgi.exercice2.Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals(Sexe.Male, chien.getSexe());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setSexe() {
        try {
            // Création du chien
            Chien chien = new Chien(
                    15,
                    "Toto",
                    org.cgi.exercice2.Sexe.Male
            );

            // Test de la fonctionnalité
            chien.setSexe(Sexe.Femelle);
            assertEquals(Sexe.Femelle, chien.getSexe());
        } catch (Exception exception) {
            fail();
        }
    }
}
