package com.polytech.tp;

public class CoursMagistral extends CoursDecorator {
    
    public CoursMagistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (Magistral)";
    }

    @Override
    public double getDuree() {
        // Un cours magistral dure 2h au lieu de 1.5h
        return 2.0;
    }
}