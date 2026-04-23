package com.ecoeat.models;

public class Etudiant {
    // Champs privés (Encapsulation) [cite: 122, 178]
    private String nom;
    private String email;
    private double solde;

    // Constructeur complet [cite: 178]
    public Etudiant(String nom, String email, double soldeInitial) {
        this.nom = nom;
        this.email = email;
        this.solde = soldeInitial;
    }

    // Méthode métier (Logique simplifiée pour Sprint 1) [cite: 181, 183]
    public void rechargerSolde(double montant) {
        this.solde += montant;
        System.out.println("Solde rechargé de " + montant + " DT pour " + this.nom);
    }

    // Méthode d'affichage pour la démo console [cite: 182, 194]
    public void afficherProfil() {
        System.out.println("Étudiant : " + nom + " | Email : " + email + " | Solde : " + solde + " DT");
    }

    // Getters et Setters (AGL Pro) [cite: 179]
    public String getNom() { return nom; }
    public double getSolde() { return solde; }
}