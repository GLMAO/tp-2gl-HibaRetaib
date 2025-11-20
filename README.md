[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rGfOobSC)


# Rapport Bonus - Design Patterns

## Diagramme de Classes

## Analyse des Principes SOLID

Principes RESPECTÉS :
1. SRP (Single Responsibility Principle) 
// Chaque classe a une seule responsabilité
CoursBuilder - Construction des objets Cours
GestionnaireEmploiDuTemps - Gestion des cours et notifications
Etudiant/Responsable - Réception des notifications
2. OCP (Open/Closed Principle) 
// Le code est ouvert à l'extension, fermé à la modification
public class CoursEnLigne extends CoursDecorator { // Extension sans modifier Cours
    public CoursEnLigne(ICours cours) {
        super(cours);
    }
    // On peut ajouter de nouvelles fonctionnalités sans toucher à Cours
}
3. LSP (Liskov Substitution Principle) 
// Les sous-classes peuvent remplacer les classes parentes
ICours cours = new CoursEnLigne(coursBase); // CoursEnLigne se comporte comme un ICours
4. ISP (Interface Segregation Principle) 
// Interfaces fines et spécifiques
public interface Observer { // Seulement update()
    void update(String message);
}

public interface Subject { // Seulement gestion des observateurs
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(String message);
}
5. DIP (Dependency Inversion Principle)

// Dépendances sur des abstractions
public class GestionnaireEmploiDuTemps implements Subject { // Implémente interface
    private List<Observer> observers; // Dépend d'interface, pas d'implémentation
}


Architecture solide respectant les bonnes pratiques des design patterns.
Principes POTENTIELLEMENT VIOLÉS :
1. Violation mineure du SRP dans GestionnaireEmploiDuTemps

public class GestionnaireEmploiDuTemps {
    // Gère à la fois la liste des cours ET le pattern Observer
    // Pourrait être séparé en deux classes
}
2. Violation potentielle du DIP dans App.java

public class App {
    public static void main(String[] args) {
        Cours cours = new CoursBuilder()...build(); // Dépend de l'implémentation concrète
        // Idéalement : utiliser une fabrique ou injection de dépendances
    }
}


code respecte 4 principes SOLID sur 5 et les violations mineures n'affectent pas la maintenabilité. L'architecture est solide et extensible.