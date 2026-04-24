package com.ecoeat.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Avis.java - Classe représentant un avis/review dans le système EcoEat
 * Encapsule les informations d'un avis laissé par un étudiant sur un repas
 */
public class Avis {
    // Champs privés (Encapsulation)
    private int idAvis;
    private Etudiant etudiant;
    private Repas repas;
    private int note;              // Note de 1 à 5
    private String commentaire;
    private LocalDateTime dateAvis;

    // Constructeur complet
    public Avis(int idAvis, Etudiant etudiant, Repas repas, int note, String commentaire) {
        this.idAvis = idAvis;
        this.etudiant = etudiant;
        this.repas = repas;
        this.note = Math.max(1, Math.min(note, 5)); // Validation : note entre 1 et 5
        this.commentaire = commentaire;
        this.dateAvis = LocalDateTime.now();
    }

    // Méthode métier pour valider l'avis
    public boolean validerAvis() {
        if (note >= 1 && note <= 5 && commentaire != null && !commentaire.isEmpty()) {
            System.out.println("Avis #" + idAvis + " validé pour " + repas.getNom() + 
                             " par " + etudiant.getNom() + " - Note: " + note + "/5");
            return true;
        } else {
            System.out.println("Erreur : Avis invalide. Note doit être entre 1 et 5.");
            return false;
        }
    }

    // Méthode d'affichage pour la démo console
    public void afficherAvis() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("=== Avis #" + idAvis + " ===");
        System.out.println("Étudiant : " + etudiant.getNom());
        System.out.println("Repas : " + repas.getNom());
        System.out.println("Note : " + note + "/5");
        System.out.println("Commentaire : " + commentaire);
        System.out.println("Date : " + dateAvis.format(formatter));
        System.out.println("---");
    }

    // Getters
    public int getIdAvis() { return idAvis; }
    public Etudiant getEtudiant() { return etudiant; }
    public Repas getRepas() { return repas; }
    public int getNote() { return note; }
    public String getCommentaire() { return commentaire; }
    public LocalDateTime getDateAvis() { return dateAvis; }
}
