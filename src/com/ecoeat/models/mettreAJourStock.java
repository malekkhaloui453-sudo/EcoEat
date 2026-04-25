package com.ecoeat.models;

/**
 * mettreAJourStock.java - Classe utilitaire pour mettre à jour les quantités de stock d'un repas.
 */
public class mettreAJourStock {
    public void actualiserStock(Repas repas, int nouvelleQuantite) {
        if (repas == null) {
            System.out.println("Erreur : repas null.");
            return;
        }
        if (nouvelleQuantite < 0) {
            System.out.println("Erreur : la quantité ne peut pas être négative.");
            return;
        }

        repas.setQuantiteStock(nouvelleQuantite);
        repas.setDisponible(nouvelleQuantite > 0);
        System.out.println("Stock mis à jour pour '" + repas.getNom() + "' : " + nouvelleQuantite + " unités.");
    }

    public void ajouterStock(Repas repas, int quantiteAjoutee) {
        if (repas == null) {
            System.out.println("Erreur : repas null.");
            return;
        }
        if (quantiteAjoutee <= 0) {
            System.out.println("Erreur : la quantité ajoutée doit être positive.");
            return;
        }

        int stockActuel = repas.getQuantiteStock();
        int nouveauStock = stockActuel + quantiteAjoutee;
        repas.setQuantiteStock(nouveauStock);
        repas.setDisponible(true);
        System.out.println("Stock augmenté de " + quantiteAjoutee + " unités pour '" + repas.getNom() + "'. Nouveau stock : " + nouveauStock + ".");
    }

    public void diminuerStock(Repas repas, int quantiteRetiree) {
        if (repas == null) {
            System.out.println("Erreur : repas null.");
            return;
        }
        if (quantiteRetiree <= 0) {
            System.out.println("Erreur : la quantité retirée doit être positive.");
            return;
        }

        int stockActuel = repas.getQuantiteStock();
        if (quantiteRetiree > stockActuel) {
            System.out.println("Erreur : stock insuffisant pour retirer " + quantiteRetiree + " unités.");
            return;
        }

        int nouveauStock = stockActuel - quantiteRetiree;
        repas.setQuantiteStock(nouveauStock);
        repas.setDisponible(nouveauStock > 0);
        System.out.println("Stock diminué de " + quantiteRetiree + " unités pour '" + repas.getNom() + "'. Nouveau stock : " + nouveauStock + ".");
    }
}

