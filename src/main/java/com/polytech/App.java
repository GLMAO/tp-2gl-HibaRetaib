package com.polytech;
import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;
import com.polytech.tp.GestionnaireEmploiDuTemps;
import com.polytech.tp.Etudiant;
import com.polytech.tp.Responsable;
import com.polytech.tp.ICours;  
import com.polytech.tp.CoursEnLigne; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("=== EXERCICE 1: PATTERN BUILDER ===");
        System.out.println( "Hello World!" );
 Cours cours = new CoursBuilder()
    .setMatiere("Génie Logiciel")
    .setEnseignant("Dr.Mazari")
    .setSalle("L1")
    .setDate("2025-10-10")
    .setHeureDebut("14:00")
    .setEstOptionnel(true)
    .setNiveau("Master")
    .setNecessiteProjecteur(true)
    .build();

System.out.println(cours.getDescription());
    
     // Exercice 2: Pattern Observer
        System.out.println("\n=== EXERCICE 2: PATTERN OBSERVER ===");
        
        GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();
        Etudiant etudiant1 = new Etudiant("Alice");
        Etudiant etudiant2 = new Etudiant("Bob");
        Responsable responsable = new Responsable("Dr. Martin");
        
        // CORRECTION: Ces méthodes existent maintenant
        gestionnaire.attach(etudiant1);
        gestionnaire.attach(etudiant2);
        gestionnaire.attach(responsable);
        
 // EXERCICE 3: PATTERN DECORATOR (VERSION SIMPLIFIÉE)
        System.out.println("\n=== EXERCICE 3: PATTERN DECORATOR ===");
        
        // Uniquement CoursEnLigne pour commencer
        ICours coursEnLigne = new CoursEnLigne(cours);
        System.out.println("Cours en ligne: " + coursEnLigne.getDescription());
        
        System.out.println("\n--- Test ajout de cours ---");
        gestionnaire.ajouterCours(cours);
        
        System.out.println("\n--- Test modification de cours ---");
        // CORRECTION: Utiliser seulement 2 paramètres
        gestionnaire.modifierCours(cours, "Changement de salle pour B205 et date pour 2025-10-11");
        
        System.out.println("\n--- Test annulation de cours ---");
        // CORRECTION: Cette méthode existe maintenant
        gestionnaire.annulerCours(cours);
        
        System.out.println("\n--- Test détachement d'observateur ---");
        // CORRECTION: Cette méthode existe maintenant
        gestionnaire.detach(etudiant2);
        gestionnaire.ajouterCours(cours);
    }
}
