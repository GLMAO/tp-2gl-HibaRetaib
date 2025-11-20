package com.polytech.tp;

public class CoursBuilder {
    // TODO: Implémenter le pattern Builder
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;
    
    
    public CoursBuilder setMatiere(String matiere) { return this; }
    public CoursBuilder setEnseignant(String enseignant) { return this; }
    public CoursBuilder setSalle(String salle) { return this; }
    public CoursBuilder setDate(String date) { return this; }   
    public CoursBuilder setHeureDebut(String heureDebut) { return this; }
    public CoursBuilder setEstOptionnel(boolean estOptionnel) { return this; }
    public CoursBuilder setNiveau(String niveau) { return this; }
    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) { return   this; }  

    
    
    public Cours build() { 
        return new Cours(matiere, enseignant, salle, date, heureDebut, 
                        estOptionnel, niveau, necessiteProjecteur);
    }
}