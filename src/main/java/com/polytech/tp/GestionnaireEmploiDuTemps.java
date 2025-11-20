package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private String changement;

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }   
    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
        notifyObservers("Un nouveau cours a été ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
        notifyObservers("Le cours a été modifié : " + message);
    }

    public void setChangement(String string) {
        // TODO Auto-generated method stub
        this.changement = string;
        notifyObservers("changement dans l'emploi"+changement);
        throw new UnsupportedOperationException("Unimplemented method 'setChangement'");

    }

    public void annulerCours(ICours cours) {
        this.listeCours.remove(cours);
        System.out.println("Cours annulé : " + cours.getDescription());
        notifyObservers("Cours annulé : " + cours.getDescription());
    }
}