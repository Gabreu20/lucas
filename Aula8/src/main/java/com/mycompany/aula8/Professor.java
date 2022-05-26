/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula8;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
        
/**
 *
 * @author ice
 */
public class Professor extends Funcionario{
    private List<DisciplinaSemestre> disciplinas;
    private String horarioAtendimento;
    private int numMaxcopias;
    private int quantidaDisciplinas; 
    
    public Professor(){
       horarioAtendimento="";
       numMaxcopias=200;
       quantidaDisciplinas=0;
       disciplinas=new ArrayList<DisciplinaSemestre>();
      
    }

    public List<DisciplinaSemestre> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaSemestre> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setQuantidaDisciplinas(int quantidaDisciplinas) {
        this.quantidaDisciplinas = quantidaDisciplinas;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public int getNumMaxcopias() {
        return numMaxcopias;
    }

    public void setNumMaxcopias(int numMaxcopias) {
        this.numMaxcopias = numMaxcopias;
    }
    public void adicionarDisciplina(){
        Scanner ler = new Scanner(System.in);
        
        
        DisciplinaSemestre disciplinaSemestre=new DisciplinaSemestre();
        Disciplina disciplina=new Disciplina();
        
        System.out.println("Nome da mateira:"); ///cria a materia 
        disciplina.setNome(ler.nextLine());
        
        disciplinaSemestre.setDisciplina(disciplina);
        disciplinaSemestre.setProfessor(this);
        
        System.out.println("informe o ano");
        disciplinaSemestre.setAnoSemestre(ler.nextInt());
        
        
    }
    public void fazerPedido()
    {
       PedidoImpressão estePedido = new PedidoImpressão();
       
       estePedido.setDono(this);
       System.out.println("informe a data");
       dataPedido;
       System.out.println("informe a cor");
       private String cor;
       System.out.println("informe a impressora");
       private String impressora;
       
       private String status;
       
       System.out.println("informe a data que seja receber");
       private String dataEntrega;
       
       System.out.println("informe o item");
       private itemImpressão item;
       
       
    }
    
}
