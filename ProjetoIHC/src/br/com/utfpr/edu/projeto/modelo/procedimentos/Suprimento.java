/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.procedimentos;

import br.com.utfpr.edu.projeto.modelo.estrutura.Aula;
import br.com.utfpr.edu.projeto.modelo.servidor.Cargo;
import br.com.utfpr.edu.projeto.modelo.servidor.Servidor;
import br.com.utfpr.edu.projeto.modelo.utils.DataFracionada;
import java.util.List;

/**
 *
 * @author Tiago Luiz Gomes
 */
public class Suprimento {

    private long id;
    private String inicio;
    private Long inscricao;
    private Cargo cargo;
    private Servidor servidor;
    private List<Aula> aulas;
    private DataFracionada data;
    
}
