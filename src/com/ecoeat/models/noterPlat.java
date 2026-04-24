package com.ecoeat.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * noterPlat.java - Classe utilitaire pour noter un repas et calculer les avis.
 */
public class noterPlat {
    private final List<Avis> avis;

    public noterPlat() {
        this.avis = new ArrayList<>();
    }

    public Avis noterRepas(Etudiant etudiant, Repas repas, int note, String commentaire) {
        if (etudiant == null || repas == null) {
            System.out.println("Erreur : étudiant ou repas null.");
            return null;
        }
        if (note < 1 || note > 5) {
            System.out.println("Erreur : note invalide. Doit être entre 1 et 5.");
            return null;
        }
        if (commentaire == null || commentaire.isEmpty()) {
            commentaire = "Aucun commentaire.";
        }

        Avis nouvelAvis = new Avis(avis.size() + 1, etudiant, repas, note, commentaire);
        if (nouvelAvis.validerAvis()) {
            avis.add(nouvelAvis);
            System.out.println("Avis ajouté pour le repas : " + repas.getNom());
            return nouvelAvis;
        }

        System.out.println("Erreur : impossible de créer l'avis.");
        return null;
    }

    public double calculerMoyenneRepas(Repas repas) {
        if (repas == null) {
            return 0;
        }
        List<Avis> avisRepas = avis.stream()
                                   .filter(a -> a.getRepas().getNom().equalsIgnoreCase(repas.getNom()))
                                   .collect(Collectors.toList());
        if (avisRepas.isEmpty()) {
            return 0;
        }
        return avisRepas.stream()
                        .mapToInt(Avis::getNote)
                        .average()
                        .orElse(0);
    }

    public void afficherNotesRepas(Repas repas) {
        if (repas == null) {
            System.out.println("Erreur : repas null.");
            return;
        }
        System.out.println("=== Avis pour : " + repas.getNom() + " ===");
        List<Avis> avisRepas = avis.stream()
                                   .filter(a -> a.getRepas().getNom().equalsIgnoreCase(repas.getNom()))
                                   .collect(Collectors.toList());
        if (avisRepas.isEmpty()) {
            System.out.println("Aucun avis pour ce repas.");
            return;
        }
        for (Avis avisItem : avisRepas) {
            avisItem.afficherAvis();
        }
        System.out.printf("Note moyenne : %.2f/5\n", calculerMoyenneRepas(repas));
    }

    public List<Avis> getAvis() {
        return new ArrayList<>(avis);
    }
}

