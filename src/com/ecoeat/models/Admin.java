package com.ecoeat.models;

/**
 * Admin.java - Classe représentant un administrateur du système EcoEat
 * Responsable de la gestion des repas, réservations et avis
 */
/**
 * Admin.java - Classe représentant un administrateur du système EcoEat
 * Responsable de la gestion des repas, réservations et avis
 */
public class Admin {
    // Champs privés (Encapsulation)
    private int idAdmin;
    private String nom;
    private String email;
    private String motDePasse;
    private boolean actif;

    // Constructeur complet
    public Admin(int idAdmin, String nom, String email, String motDePasse) {
        this.idAdmin = idAdmin;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.actif = true;
    }

    // Méthode métier pour authentifier l'admin
    public boolean authentifier(String email, String motDePasse) {
        if (this.email.equals(email) && this.motDePasse.equals(motDePasse) && this.actif) {
            System.out.println("Authentification réussie pour l'admin : " + this.nom);
            return true;
        } else {
            System.out.println("Erreur : Authentification échouée pour " + email);
            return false;
        }
    }

    // Méthode métier pour ajouter un repas
    public void ajouterRepas(Repas repas) {
        if (repas != null) {
            System.out.println("Repas '" + repas.getNom() + "' ajouté par l'admin " + this.nom);
        } else {
            System.out.println("Erreur : Impossible d'ajouter un repas null.");
        }
    }

    // Méthode métier pour supprimer un repas (marquer comme indisponible)
    public void supprimerRepas(Repas repas) {
        if (repas != null) {
            repas.setDisponible(false);
            System.out.println("Repas '" + repas.getNom() + "' supprimé (marqué indisponible) par l'admin " + this.nom);
        } else {
            System.out.println("Erreur : Impossible de supprimer un repas null.");
        }
    }

    // Méthode métier pour consulter une réservation
    public void consulterReservation(Reservation reservation) {
        if (reservation != null) {
            System.out.println("Consultation de la réservation par l'admin " + this.nom + " :");
            reservation.afficherDetails();
        } else {
            System.out.println("Erreur : Réservation null.");
        }
    }

    // Méthode métier pour consulter un avis
    public void consulterAvis(Avis avis) {
        if (avis != null) {
            System.out.println("Consultation de l'avis par l'admin " + this.nom + " :");
            avis.afficherAvis();
        } else {
            System.out.println("Erreur : Avis null.");
        }
    }

    // Méthode d'affichage pour la démo console
    public void afficherProfil() {
        System.out.println("=== Profil Admin ===");
        System.out.println("ID : " + idAdmin);
        System.out.println("Nom : " + nom);
        System.out.println("Email : " + email);
        System.out.println("Actif : " + (actif ? "Oui" : "Non"));
        System.out.println("---");
    }

    // Getters et Setters
    public int getIdAdmin() { return idAdmin; }
    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }
}
