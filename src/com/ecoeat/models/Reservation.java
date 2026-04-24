package com.ecoeat.models;

/**
 * Classe Reservation - Responsable : [Votre Nom]
 * Fonctionnalité : Cycle de vie d'une réservation et validation
 */
public class Reservation {
    private int idReservation;
    private Etudiant etudiant; // Relation avec la classe de votre collègue
    private Repas repas;       // Relation avec la classe de votre collègue
    private String statut;     // "Confirmée", "Annulée", "Consommée"

    // Constructeur
    public Reservation(int idReservation, Etudiant etudiant, Repas repas) {
        this.idReservation = idReservation;
        this.etudiant = etudiant;
        this.repas = repas;
        this.statut = "En attente";
    }

    // Méthode métier pour le Sprint 1
    public boolean validerReservation() {
        // Logique simplifiée pour la V1 : on vérifie si le stock est suffisant
        if (repas.getQuantiteStock() > 0) {
            this.statut = "Confirmée";
            System.out.println("Réservation #" + idReservation + " validée pour " + etudiant.getNom());
            return true;
        } else {
            this.statut = "Échec - Stock épuisé";
            System.out.println("Erreur : Plus de " + repas.getNom() + " en stock.");
            return false;
        }
    }

    public void afficherDetails() {
        System.out.println("Réservation ID: " + idReservation + 
                           " | Plat: " + repas.getNom() + 
                           " | Client: " + etudiant.getNom() + 
                           " | Statut: " + statut);
    }

    // Getters
    public String getStatut() { return statut; }
}