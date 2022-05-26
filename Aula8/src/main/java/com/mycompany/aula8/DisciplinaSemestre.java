/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula8;

/**
 *
 * @author ice
 */
public class DisciplinaSemestre {
        private int anoSemestre;
        private Professor professor;
        private Disciplina disciplina;
        
        public DisciplinaSemestre(){
            anoSemestre=0;
        }

    public int getAnoSemestre() {
        return anoSemestre;
    }

    public void setAnoSemestre(int anoSemestre) {
        this.anoSemestre = anoSemestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    
    }

        
