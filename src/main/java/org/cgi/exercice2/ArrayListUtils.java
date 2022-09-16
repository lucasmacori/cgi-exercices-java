package org.cgi.exercice2;

import java.util.ArrayList;

public class ArrayListUtils {
    /**
     * Retourne la position de la première occurence de la valeur dans la liste
     * @param list la liste dans laquelle rechercher la valeur
     * @param value la valeur à rechercher dans la liste
     * @return la position de la première ocurrence de la valeur "value" dans la liste "list"
     *         si la valeur n'existe pas dans la liste, le nombre -1 sera retourné
     */
    public static int firstIndexOf(ArrayList<Integer> list, int value) {
        /*
            Cette méthode existe déjà dans l'objet ArrayList
            En l'occurence, il s'agit de la méthode "indexOf".
            Toute fois, pour le bien de l'exercice, nous la redéveloppons
         */
        // Parcours de la liste
        for (int i = 0; i < list.size(); i++) {
            int currentValue = list.get(i);

            // Si la valeur actuelle correpond à la valeur recherchée, retour de l'index
            if (currentValue == value) {
                return i;
            }
        }

        // Retour de -1 si le résultat n'est pas trouvé dans la liste
        return -1;
    }

    /**
     * Tri la liste d'entier par valeur croissante en suivant l'algorithme du tri à bulle
     * @param list la liste à trier
     * @return la liste triée par ordre croissant
     */
    public static ArrayList<Integer> orderByValue(ArrayList<Integer> list) {
        // Si la liste ne contient pas au moins deux éléments, on considère qu'elle est triée
        // On n'exécute donc pas la suite du traitement
        if (list.size() < 2) return list;

        // Tant que la liste n'est pas ordonnée
        while (!isListInOrder(list)) {
            // Parcours de la liste
            for (int i = 1; i < list.size(); i++) {
                int currentValue = list.get(i);
                int previousValue = list.get(i - 1);

                // Si la valeur est inférieure à la valeur précédente, inversion des deux valeurs
                if (currentValue < previousValue) {
                    list.set(i, previousValue);
                    list.set(i - 1, currentValue);
                }
            }
        }

        return list;
    }

    /**
     * Indique si une liste de nombres entiers est triée dans l'ordre croissant ou non
     * @param list la liste à vérifier
     * @return "true" si la liste est triée, "false" si la liste n'est pas triée
     */
    private static boolean isListInOrder(ArrayList<Integer> list) {
        // Si la liste ne contient pas au moins deux éléments, on considère qu'elle est triée
        // On n'exécute donc pas la suite du traitement
        if (list.size() < 2) return true;

        // Parcours de la liste
        for (int i = 1; i < list.size(); i++) {
            int currentValue = list.get(i);
            int previousValue = list.get(i - 1);

            // Si la valeur est inférieure à la valeur précédente, la liste n'est pas dans l'ordre
            if (currentValue < previousValue) return false;
        }

        // Si la boucle n'a pas été interrompue, la liste est dans l'ordre
        return true;
    }
}
