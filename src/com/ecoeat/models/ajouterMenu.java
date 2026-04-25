package com.ecoeat.models;

import java.util.ArrayList;
import java.util.List;

/**
 * ajouterMenu.java - Classe utilitaire pour gérer un menu de repas EcoEat.
 */
public class ajouterMenu {
    private final List<Repas> menu;

    public ajouterMenu() {
        this.menu = new ArrayList<>();
    }

    /**
     * Ajoute un repas au menu si le repas n'est pas null.
     */
    public void ajouterRepas(Repas repas) {
        if (repas != null) {
            menu.add(repas);
            System.out.println("Repas ajouté au menu : " + repas.getNom());
        } else {
            System.out.println("Erreur : impossible d'ajouter un repas null au menu.");
        }
    }

    /**
     * Supprime un repas du menu en le marquant comme indisponible.
     */
    public void supprimerRepas(String nomRepas) {
        Repas trouv = trouverRepasParNom(nomRepas);
        if (trouv != null) {
            trouv.setDisponible(false);
            System.out.println("Repas '" + nomRepas + "' marqué comme indisponible.");
        } else {
            System.out.println("Erreur : repas '" + nomRepas + "' introuvable dans le menu.");
        }
    }

    /**
     * Retourne un repas du menu par son nom.
     */
    public Repas trouverRepasParNom(String nomRepas) {
        if (nomRepas == null || nomRepas.isEmpty()) {
            return null;
        }
        for (Repas repas : menu) {
            if (repas.getNom().equalsIgnoreCase(nomRepas)) {
                return repas;
            }
        }
        return null;
    }

    /**
     * Affiche tous les repas présents dans le menu.
     */
    public void afficherMenu() {
        if (menu.isEmpty()) {
            System.out.println("Le menu est vide.");
            return;
        }
        System.out.println("=== Menu EcoEat ===");
        for (Repas repas : menu) {
            repas.afficherRepas();
            System.out.println("--------------------");
        }
    }

    public List<Repas> getMenu() {
        return new ArrayList<>(menu);
    }
}

