package org.cgi.exercice1.junit;

import org.cgi.exercice1.Developpeur;
import org.cgi.exercice1.Manager;
import org.cgi.exercice1.Skills;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeveloppeurTest {
    @Test
    public void getManager() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    new ArrayList<>()
            );

            // Création du développeur
            Developpeur developpeur = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    manager,
                    new ArrayList<>()
            );

            // Test de la fonctionnalité
            assertEquals(manager, developpeur.getManager());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setManager() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    new ArrayList<>()
            );

            // Création du développeur
            Developpeur developpeur = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    manager,
                    new ArrayList<>()
            );

            // Création du nouveau manager du développeur
            Manager nouveauManager = new Manager(
                    "Moreau",
                    "Honoré",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1969"),
                    187,
                    new ArrayList<>()
            );

            // Test de la fonctionnalité
            developpeur.setManager(nouveauManager);
            assertEquals(nouveauManager, developpeur.getManager());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getSkills() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    new ArrayList<>()
            );

            // Création de la liste des compéténces du développeur
            ArrayList<Skills> skills = new ArrayList<>();
            skills.add(Skills.PHP);
            skills.add(Skills.Java);

            // Création du développeur
            Developpeur developpeur = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    manager,
                    skills
            );

            // Test de la fonctionnalité
            assertEquals(skills, developpeur.getSkills());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setSkills() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    new ArrayList<>()
            );

            // Création de la liste des compéténces du développeur
            ArrayList<Skills> skills = new ArrayList<>();
            skills.add(Skills.PHP);
            skills.add(Skills.Java);

            // Création du développeur
            Developpeur developpeur = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    manager,
                    skills
            );

            // Création de la liste des nouvelles compétences du développeur
            ArrayList<Skills> nouveauSkills = new ArrayList<>();
            skills.add(Skills.Angular);
            skills.add(Skills.Jenkins);
            skills.add(Skills.React);

            // Test de la fonctionnalité
            developpeur.setSkills(nouveauSkills);
            assertEquals(nouveauSkills, developpeur.getSkills());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getAge() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    new ArrayList<>()
            );

            // Création du développeur
            Developpeur developpeur = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    manager,
                    new ArrayList<>()
            );

            // Test de la fonctionnalité
            Date currentDate = new Date();
            assertEquals(
                    Period.between(
                        developpeur.getDateNaissance().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                    ).getYears(),
                    developpeur.getAge()
            );
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void addSkills() {
        try {
            // Création du manager du développeur
            Manager manager = new Manager(
                    "Pichon",
                    "Elisabelle",
                    new SimpleDateFormat("dd-MM-yyyy").parse("17-12-1972"),
                    159,
                    new ArrayList<>()
            );

            // Création de la liste des compéténces du développeur
            ArrayList<Skills> skills = new ArrayList<>();
            skills.add(Skills.PHP);
            skills.add(Skills.Java);

            // Création du développeur
            Developpeur developpeur = new Developpeur(
                    "Dupont",
                    "Jean",
                    new SimpleDateFormat("dd-MM-yyyy").parse("09-07-1975"),
                    178,
                    manager,
                    skills
            );

            // Création de la liste des nouvelles compétences du développeur
            ArrayList<Skills> nouveauxSkills = new ArrayList<>();
            skills.add(Skills.Angular);
            skills.add(Skills.React);

            // Test de la fonctionnalité
            developpeur.addSkills(nouveauxSkills);
            assertTrue(developpeur.getSkills().contains(Skills.PHP) && developpeur.getSkills().contains(Skills.Java));
            assertTrue(developpeur.getSkills().contains(Skills.Angular) && developpeur.getSkills().contains(Skills.React));
        } catch (Exception exception) {
            fail();
        }
    }
}
