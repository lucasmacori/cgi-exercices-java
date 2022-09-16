package org.cgi.exercice1;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main
{
    public static void main( String[] args ) throws ParseException {

        ArrayList<Personne> personnes = new ArrayList<>();

        // Création des quatre développeurs
        Developpeur developpeur1 = new Developpeur(
                "MARCHAND",
                "Pierre",
                new SimpleDateFormat("dd-MM-yyyy").parse("14-02-1989"),
                180,
                Sexe.H,
                null,
                null
        );
        personnes.add(developpeur1);

        Developpeur developpeur2 = new Developpeur(
                "DURANT",
                "Paul",
                new SimpleDateFormat("dd-MM-yyyy").parse("18-07-1991"),
                178,
                Sexe.H,
                null,
                null
        );
        personnes.add(developpeur2);

        Developpeur developpeur3 = new Developpeur(
                "ADIT",
                "Jacques",
                new SimpleDateFormat("dd-MM-yyyy").parse("24-12-1980"),
                160,
                Sexe.H,
                null,
                null
        );
        personnes.add(developpeur3);

        Developpeur developpeur4 = new Developpeur(
                "PACOT",
                "Julie",
                new SimpleDateFormat("dd-MM-yyyy").parse("09-08-1976"),
                165,
                Sexe.F,
                null,
                null
        );
        personnes.add(developpeur4);

        // Création des deux managers
        Manager manager1 = new Manager(
                "DEBIF",
                "Sam",
                new SimpleDateFormat("dd-MM-yyyy").parse("07-09-1972"),
                168,
                Sexe.F,
                null
        );
        personnes.add(manager1);

        Manager manager2 = new Manager(
                "DUMONT",
                "Raumane",
                new SimpleDateFormat("dd-MM-yyyy").parse("04-04-1983"),
                154,
                Sexe.F,
                null
        );
        personnes.add(manager2);

        // Ajout de Sam en tant que manager de Pierre et de Paul
        manager1.addMembre(developpeur1);
        manager1.addMembre(developpeur2);
        developpeur1.setManager(manager1);
        developpeur2.setManager(manager1);

        // Ajout de Raumane en tant que manager de Jacques et de Julie
        manager2.addMembre(developpeur3);
        manager2.addMembre(developpeur4);
        developpeur3.setManager(manager2);
        developpeur4.setManager(manager2);

        // Ajout des compétences aux développeurs
        developpeur1.addSkills(new ArrayList<>() {
            {
                add(Skills.Java);
                add(Skills.PHP);
            }
        });
        developpeur2.addSkills(new ArrayList<>() {
            {
                add(Skills.Angular);
                add(Skills.GCP);
                add(Skills.Jenkins);
            }
        });
        developpeur3.addSkills(new ArrayList<>() {
            {
                add(Skills.React);
                add(Skills.Angular);
                add(Skills.Java);
            }
        });
        developpeur4.addSkills(new ArrayList<>() {
            {
                add(Skills.Delivery);
                add(Skills.GCP);
                add(Skills.Jenkins);
                add(Skills.Angular);
            }
        });

        // Lister le nom, le prénom et l'age des membres qui ont la compétences Java et le nom et prénom du manager à contacter.
        System.out.println("Membres ayant la compétence Java :");
        for (Personne personne : personnes) {
            // Si la personne est un développeur
            if (personne.getClass() == Developpeur.class) {
                // Vérification que le développeur possède la compétence "Java"
                if (((Developpeur) personne).getSkills().contains(Skills.Java)) {
                    System.out.println(personne.toString());
                }
            }
        }

        System.out.println("\n-------------------------------------------------\n");

        // Lister toutes les personnes qui mesurent plus de 160cm
        System.out.println("Personnes mesurant plus de 1m60 :");
        for (Personne personne : personnes) {
            if (personne.getTaille() > 160) {
                System.out.println(personne.toString());
            }
        }
    }
}
