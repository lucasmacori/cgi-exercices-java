package org.cgi.exercice2.junit;

import org.cgi.exercice2.ArrayListUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayListUtilsTest {
    @Test
    public void firstIndexOf() {
        // Création de la liste
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(4);
        liste.add(8);
        liste.add(1);
        liste.add(0);

        // Test de la fonctionnalité
        assertEquals(2, ArrayListUtils.firstIndexOf(liste, 1));
    }

    @Test
    public void firstIndexOf_nombreInexistant() {
        // Création de la liste
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(4);
        liste.add(8);
        liste.add(1);
        liste.add(0);

        // Test de la fonctionnalité
        assertEquals(-1, ArrayListUtils.firstIndexOf(liste, 14));
    }

    @Test
    public void firstIndexOf_listeVide() {
        // Création de la liste
        ArrayList<Integer> liste = new ArrayList<>();

        // Test de la fonctionnalité
        assertEquals(-1, ArrayListUtils.firstIndexOf(liste, 14));
    }

    @Test
    public void firstIndexOf_listeNulle() {
        // Test de la fonctionnalité
        assertThrows(NullPointerException.class, () -> {
            ArrayListUtils.firstIndexOf(null, 14);
        });
    }

    @Test
    public void firstIndexOf_valeurNulle() {
        // Création de la liste
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(4);
        liste.add(8);
        liste.add(1);
        liste.add(0);

        // Test de la fonctionnalité
        assertEquals(-1, ArrayListUtils.firstIndexOf(liste, null));
    }

    @Test
    public void orderByValue() {
        // Création de la liste
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(4);
        liste.add(8);
        liste.add(1);
        liste.add(0);

        // Création de la liste triée
        ArrayList<Integer> listeTriée = new ArrayList<>();
        liste.add(4);
        liste.add(8);
        liste.add(1);
        liste.add(0);

        // Test de la fonctionnalité
        assertEquals(listeTriée, ArrayListUtils.orderByValue(liste));
    }

    @Test
    public void orderByValue_listeVide() {
        // Création de la liste
        ArrayList<Integer> liste = new ArrayList<>();

        // Test de la fonctionnalité
        assertEquals(liste, ArrayListUtils.orderByValue(liste));
    }

    @Test
    public void orderByValue_listeNulle() {
        // Test de la fonctionnalité
        assertThrows(NullPointerException.class, () -> {
            ArrayListUtils.orderByValue(null);
        });
    }
}
