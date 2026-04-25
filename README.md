# 🌱 EcoEat - Solution Digitale de Gestion de Cantine Scolaire

**Une plateforme numérique pour moderniser et optimiser l'expérience de restauration universitaire à la FSEGT.**

---

## 📋 Informations Générales

| Information | Détail |
|-------------|--------|
| **Projet** | Solution digitale de gestion de cantine scolaire |
| **Institution** | Faculté des Sciences Économiques et de Gestion de Tunis (FSEGT) |
| **Cours** | AGL (Analyse et Génie Logiciel) - Sprints 1 & 2 |
| **Période** | Avril 2026 |
| **Dépôt GitHub** | [malekkhaloui453-sudo/EcoEat](https://github.com/malekkhaloui453-sudo/EcoEat) |

---

## 🎯 1. Introduction et Pitch

### 1.1 Contexte et Problématique

Le milieu universitaire tunisien, et plus particulièrement la FSEGT, connaît une affluence quotidienne massive au sein de ses infrastructures de restauration. Actuellement, le système repose sur des transactions manuelles et une gestion de stock à vue, ce qui engendre trois problèmes majeurs :

- **⏱️ Temps d'attente excessif** : Des files d'attente interminables qui impactent l'emploi du temps des étudiants.
- **🍽️ Gaspillage alimentaire** : Une production de repas non calibrée par rapport à la demande réelle.
- **💰 Gestion financière archaïque** : Une dépendance totale au paiement en espèces, source d'erreurs et de lenteur.

### 1.2 La Solution : EcoEat

EcoEat est une plateforme digitale conçue pour moderniser et optimiser l'expérience de restauration universitaire. Notre solution repose sur un écosystème en trois piliers :

1. **💳 Digitalisation du paiement** : Un portefeuille numérique (E-Wallet) permettant des transactions rapides et sécurisées.
2. **📅 Planification intelligente** : Un système de pré-commande permettant à l'étudiant de réserver son plat et à la cantine de prévoir la production exacte.
3. **📊 Pilotage par la donnée** : Un tableau de bord administratif offrant une visibilité en temps réel sur les stocks et les revenus.

### 1.3 Objectifs du Projet

L'objectif de ce projet est de démontrer notre capacité à mener un cycle complet de développement logiciel, de la conception architecturale à la réalisation d'un prototype fonctionnel en Java, tout en respectant une méthodologie Scrum rigoureuse et une collaboration efficace via GitHub.

---

## 📐 2. Analyse et Planification

### 2.1 Product Backlog (User Stories)

Le travail a été réparti de manière équitable entre les membres du groupe :

| Membre | Rôle Principal | User Stories Clés |
|--------|----------------|------------------|
| Membre A | Gestion Utilisateur | S'authentifier, consulter et recharger son solde (Wallet). |
| Membre B | Flux Réservation | Consulter le menu du jour, sélectionner un plat et réserver. |
| Membre C | Administration | Accéder au dashboard, valider les repas servis et statistiques. |

### 2.2 Modélisation UML

La modélisation a été conçue via PlantUML pour assurer une architecture solide et une compréhension commune du projet.

#### A. Diagramme de Cas d'Utilisation
- **Acteurs** : Étudiant, Admin, Système
- **Cas d'utilisation principaux** : Authentification, Réservation, Gestion du portefeuille, Tableau de bord administratif

#### B. Diagramme de Classes
Structure technique organisée autour de :
- **User** : Classe de base pour les acteurs
- **Student** : Hérite de User, gère les réservations
- **Admin** : Gestion des menus et statistiques
- **Wallet** : Gestion des transactions financières
- **Reservation** : Cycle de vie complet (En attente → Confirmée → Servie)
- **Menu** : Gestion quotidienne des plats

#### C. Diagramme de Séquence
Illustre le flux complet d'une réservation réussie :
1. Étudiant se connecte
2. Consultation du menu du jour
3. Sélection d'un repas
4. Déduction du solde
5. Génération du QR Code
6. Validation par l'admin

---

## 🎨 3. Conception Graphique

### Parcours Utilisateur

L'interface a été pensée pour la rapidité et l'accessibilité :

1. **Connexion** : Via identifiants universitaires
2. **Accueil** : Affichage du menu du jour et du solde actuel
3. **Sélection** : Choix du repas avec aperçu nutritionnel
4. **Validation** : Confirmation par empreinte numérique ou code PIN
5. **Retrait** : QR Code généré pour le retrait au comptoir

### Choix du Design

- **Palette Couleur** : Utilisation dominante du "Vert Éco" (#2ECC71) pour symboliser le développement durable et la fraîcheur.
- **Ergonomie** : Interface "Mobile First" avec des boutons larges pour une utilisation facilitée dans la file d'attente.
- **Accessibilité** : Contraste élevé, typographie lisible, navigation intuitive.

---

## 💻 4. Réalisation Technique

### 4.1 Architecture du Code

Le projet suit les principes de la programmation orientée objet (POO) organisée dans le package `com.ecoeat.models`. 

**Principes appliqués** :
- ✅ **Encapsulation** : Attributs privés avec getters/setters sécurisés
- ✅ **Héritage** : Structure hiérarchique User → Student/Admin
- ✅ **Polymorphisme** : Méthodes virtuelles pour différents types d'utilisateurs
- ✅ **Abstraction** : Classes abstraites pour les comportements génériques

### 4.2 Implémentation des Fonctionnalités

#### Membre A - Module Wallet
- **Méthode clé** : `rechargerSolde(double montant)`
- **Vérifications** : Contrôle des limites de plafond, validation du montant
- **Fonctionnalités** : Historique des transactions, notifications de solde

#### Membre B - Module Réservation
- **Logique complexe** : Cycle de vie avec statuts (En attente, Confirmée, Servie)
- **Validation** : Vérification du solde, disponibilité du plat
- **Optimisation** : Algorithme de prédiction de demande

#### Membre C - Module Administration
- **Tableau de bord** : Statistiques en temps réel
- **Algorithmes** : Calcul du gaspillage évité, tendances de consommation
- **Rapports** : Export des données pour analyse

### 4.3 Stack Technologique

- **Langage** : Java 11+
- **Architecture** : Programmation Orientée Objet (POO)
- **Gestion de projet** : Maven
- **Versioning** : Git & GitHub
- **Futur** : Base de données PostgreSQL, API REST, Interface web

---

## 🛠️ 5. Gestion de Projet et Git

### Méthodologie Agile

Nous avons appliqué la méthode **Scrum** avec deux Sprints d'une semaine :

- **Sprint Planning** : Définition des objectifs et des user stories
- **Daily Stand-up** : Points quotidiens de synchronisation
- **Sprint Review** : Démonstration des livrables
- **Sprint Retrospective** : Amélioration continue du processus

### Workflow Git

```
main (Production)
├── feature/wallet (Membre A)
├── feature/reservation (Membre B)
├── feature/admin-dashboard (Membre C)
└── develop (Intégration)
```

**Pratiques** :
- 🌿 Branche `main` : Code stable et testé
- 🔀 Branches `feature/nom-membre` : Développement isolé
- ✅ Pull Requests systématiques : Révision du code avant intégration
- 📝 Commits sémantiques : Messages clairs et informatifs

### Collaboration

- **Communication** : Issues GitHub, discussions
- **Documentation** : Commentaires de code et README
- **Révision de code** : Validation mutuelle avant merge

---

## 🤖 6. Utilisation de l'IA

Dans ce projet, l'IA a servi de "maçon qualifié" :

- **Génération de boilerplate** : Création rapide des classes de base
- **Débogage** : Identification rapide d'erreurs de syntaxe en Java
- **Documentation** : Génération de commentaires et documentation technique
- **Valeur ajoutée humaine** : La logique métier, l'architecture globale et les décisions stratégiques restent du ressort de l'équipe

---

## 🚀 7. Installation et Utilisation

### Prérequis
- Java 11 ou supérieur
- Maven 3.6+
- Git

### Étapes d'Installation

```bash
# Cloner le repository
git clone https://github.com/malekkhaloui453-sudo/EcoEat.git
cd EcoEat

# Compiler le projet
mvn clean install

# Lancer l'application
mvn exec:java -Dexec.mainClass="com.ecoeat.Main"
```

---

## ✅ 8. Résultats et Livrables

### Livrables Réalisés

- ✅ **Livrable 1** : Rapport d'analyse et conception graphique
- ✅ **Livrable 2** : Modélisation UML complète (Cas d'utilisation, Classes, Séquence)
- ✅ **Livrable 4** : Prototype fonctionnel en Java
- ✅ **Documentation** : README complet et code commenté
- ✅ **Gestion de Projet** : Workflow Git et collaboration efficace

### État du Prototype

Le prototype Java actuel permet de simuler une chaîne complète :
- ✅ Connexion et authentification de l'étudiant
- ✅ Consultation du menu et réservation
- ✅ Gestion du portefeuille numérique
- ✅ Génération de statistiques pour l'administration
- ✅ Calcul de l'impact écologique (gaspillage évité)

---

## 🔮 9. Perspectives et Évolutions Futures (V2 & V3)

### Version 2
- 🗄️ Intégration d'une base de données SQL réelle (PostgreSQL)
- 🔐 Système d'authentification robuste (JWT)
- 📧 Notifications par email

### Version 3
- 💳 Module de paiement mobile (D17/Flouci)
- 📱 Application mobile native
- 🔔 Notifications Push pour rappeler l'heure limite de réservation
- 📊 Dashboard analytique avancé
- 🌍 Intégration des objectifs de développement durable (ODD)

---

## 📞 Support et Contribution

### Pour Contribuer
1. Forkez le projet
2. Créez une branche (`git checkout -b feature/AmazingFeature`)
3. Committez vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Poussez vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrez une Pull Request

### Directives
- Respectez les conventions de code Java
- Écrivez des tests pour vos fonctionnalités
- Mettez à jour la documentation si nécessaire

---

## 📄 Licence

Ce projet est open source et disponible sous la licence MIT.

---

## 🌿 Notre Mission

EcoEat incarne notre engagement envers :
- **L'efficacité** : Réduire les temps d'attente et le gaspillage
- **L'innovation** : Moderniser les services universitaires
- **La durabilité** : Promouvoir des choix alimentaires responsables
- **L'accessibilité** : Faciliter l'accès aux services pour tous

**Ensemble, nous modernisons la restauration universitaire. 🚀**

---

**Fait à Tunis, Avril 2026.**

*Projet réalisé dans le cadre du cours AGL (Analyse et Génie Logiciel) à la FSEGT.*
