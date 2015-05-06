/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.procedimentos;

import br.com.utfpr.edu.projeto.modelo.servidor.Cargo;
import br.com.utfpr.edu.projeto.modelo.servidor.Servidor;
import br.com.utfpr.edu.projeto.modelo.utils.DataFracionada;

/**
 *
 * @author Tiago Luiz Gomes
 */
public class Afastamento {

    private long id;
    private String inicio, fim, motivo;
    private Long numeroAto, inscricao;
    private Servidor afastado;
    private Cargo cargo;
    private DataFracionada data;

}
