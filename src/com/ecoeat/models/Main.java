package com.ecoeat.models;

/**
 * Main.java - Point d'entrée pour la démonstration du Sprint 1
 * Objectif : Prouver que l'architecture fonctionne [cite: 200]
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EcoEat - Démo Sprint 1 ===\n");

        // 1. Instanciation d'un étudiant (Données en dur pour le prototype) [cite: 190]
        Etudiant etudiant1 = new Etudiant("Ahmed Ben Ali", "ahmed@etudiant.tn", 20.0);

        // 2. Instanciation d'un repas
        Repas repas1 = new Repas("Couscous Tunisien", "Plat traditionnel tunisien avec légumes et viande", 12.0);

        // 3. Appel des méthodes de base [cite: 191]
        System.out.println("--- Profil Étudiant ---");
        etudiant1.afficherProfil();

        System.out.println("\n--- Menu Disponible ---");
        repas1.afficherRepas();

        System.out.println("\n--- Simulation de Commande ---");
        etudiant1.rechargerSolde(10.0);
        System.out.println("Nouveau solde : " + etudiant1.getSolde() + " DT");

        System.out.println("\n✅ Prototype V1 opérationnel.");
    }
}