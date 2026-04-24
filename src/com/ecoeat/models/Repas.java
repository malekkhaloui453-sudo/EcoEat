package com.ecoeat.models;

/**
 * Repas.java - Classe représentant un repas dans le système EcoEat
 * Encapsule les informations d'un repas disponible à la commande
 */
public class Repas {
    // Champs privés (Encapsulation) [cite: 122, 178]
    private String nom;
    private String description;
    private double prix;
    private boolean disponible;
    private int quantiteStock;

    // Constructeur complet [cite: 178]
    public Repas(String nom, String description, double prix, int quantiteStock) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.disponible = true; // Par défaut disponible
        this.quantiteStock = quantiteStock;
    }

    // Méthode métier pour vérifier la disponibilité [cite: 181, 183]
    public boolean estDisponible() {
        return disponible;
    }

    // Méthode pour changer la disponibilité (pour la gestion)
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    // Méthode d'affichage pour la démo console [cite: 182, 194]
    public void afficherRepas() {
        System.out.println("Repas : " + nom + " | Prix : " + prix + " DT | Disponible : " + (disponible ? "Oui" : "Non"));
        System.out.println("Description : " + description);
    }

    // Getters (AGL Pro) [cite: 179]
    public String getNom() { return nom; }
    public double getPrix() { return prix; }
    public String getDescription() { return description; }
    public int getQuantiteStock() { return quantiteStock; }
}