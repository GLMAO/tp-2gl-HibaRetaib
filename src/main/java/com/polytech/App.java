package com.polytech;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
    }
}
