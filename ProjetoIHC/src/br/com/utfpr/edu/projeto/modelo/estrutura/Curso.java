/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.estrutura;

import java.util.List;


/**
 *
 * @author Cliente
 */
public class Curso {
    private long id;
    private String nome;
    private Turno turno;
    private Boolean status;
    private List<Turma>turmas;
}
