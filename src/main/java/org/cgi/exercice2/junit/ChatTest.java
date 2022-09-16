package org.cgi.exercice2.junit;

import org.cgi.exercice2.Chat;
import org.cgi.exercice2.Sexe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ChatTest {
    @Test
    public void getAge() {
        try {
            // Création du chat
            Chat chat = new Chat(
                    15,
                    "Toto",
                    Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals(15, chat.getAge());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setAge() {
        try {
            // Création du chat
            Chat chat = new Chat(
                    15,
                    "Toto",
                    Sexe.Male
            );

            // Test de la fonctionnalité
            chat.setAge(6);
            assertEquals(6, chat.getAge());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getNom() {
        try {
            // Création du chat
            Chat chat = new Chat(
                    15,
                    "Toto",
                    Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals("Toto", chat.getNom());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setNom() {
        try {
            // Création du chat
            Chat chat = new Chat(
                    15,
                    "Toto",
                    Sexe.Male
            );

            // Test de la fonctionnalité
            chat.setNom("Titi");
            assertEquals("Titi", chat.getNom());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getSon() {
        try {
            // Création du chat
            Chat chat = new Chat(
                    15,
                    "Toto",
                    Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals("Miaouw", chat.getSon());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getNbPattes() {
        try {
            // Création du chat
            Chat chat = new Chat(
                    15,
                    "Toto",
                    Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals(4, chat.getNbPattes());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void getSexe() {
        try {
            // Création du chat
            Chat chat = new Chat(
                    15,
                    "Toto",
                    Sexe.Male
            );

            // Test de la fonctionnalité
            assertEquals(Sexe.Male, chat.getSexe());
        } catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void setSexe() {
        try {
            // Création du chat
            Chat chat = new Chat(
                    15,
                    "Toto",
                    Sexe.Male
            );

            // Test de la fonctionnalité
            chat.setSexe(Sexe.Femelle);
            assertEquals(Sexe.Femelle, chat.getSexe());
        } catch (Exception exception) {
            fail();
        }
    }
}
