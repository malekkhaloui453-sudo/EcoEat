package com.ecoeat.models;

/**
 * calculerGaspillage.java - Classe utilitaire pour mesurer le gaspillage alimentaire.
 */
public class calculerGaspillage {
    /**
     * Calcule la quantité de repas gaspillés.
     *
     * @param quantiteInitiale Quantité prévue initialement
     * @param quantiteVendue   Quantité réellement vendue
     * @return Quantité gaspillées (toujours >= 0)
     */
    public double calculerQuantiteGaspillee(int quantiteInitiale, int quantiteVendue) {
        if (quantiteInitiale <= 0) {
            return 0;
        }
        int gaspillage = quantiteInitiale - quantiteVendue;
        return Math.max(gaspillage, 0);
    }

    /**
     * Calcule le taux de gaspillage en pourcentage.
     *
     * @param quantiteInitiale Quantité prévue initialement
     * @param quantiteVendue   Quantité réellement vendue
     * @return Pourcentage de gaspillage entre 0 et 100
     */
    public double calculerPourcentageGaspillage(int quantiteInitiale, int quantiteVendue) {
        if (quantiteInitiale <= 0) {
            return 0;
        }
        double gaspillage = calculerQuantiteGaspillee(quantiteInitiale, quantiteVendue);
        return (gaspillage / quantiteInitiale) * 100.0;
    }

    /**
     * Affiche le gaspillage calculé pour un repas donné.
     */
    public void afficherGaspillage(String nomRepas, int quantiteInitiale, int quantiteVendue) {
        double gaspillage = calculerQuantiteGaspillee(quantiteInitiale, quantiteVendue);
        double pourcentage = calculerPourcentageGaspillage(quantiteInitiale, quantiteVendue);

        System.out.println("=== Gaspillage alimentaire ===");
        System.out.println("Repas : " + nomRepas);
        System.out.println("Quantité prévue : " + quantiteInitiale);
        System.out.println("Quantité vendue : " + quantiteVendue);
        System.out.println("Quantité gaspillées : " + (int) gaspillage);
        System.out.printf("Taux de gaspillage : %.2f%%\n", pourcentage);
    }
}
