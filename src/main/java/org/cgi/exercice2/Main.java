package org.cgi.exercice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création d'une liste d'animaux
        ArrayList<Animal> animaux = new ArrayList<>();

        // Création d'un chien
        Chien chien = new Chien(15, "Toto", Sexe.Male);
        animaux.add(chien);

        // Création d'un chat
        Chat chat = new Chat(3, "Tata", Sexe.Femelle);
        animaux.add(chat);

        // Affichage des données des animaux
        System.out.println("Affichage des données des animaux :");
        for (Animal animal : animaux) {
            System.out.println(animal.toString());
        }
    }
}
