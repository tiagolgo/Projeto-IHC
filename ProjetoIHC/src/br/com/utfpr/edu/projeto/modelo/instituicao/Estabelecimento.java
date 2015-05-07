/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.instituicao;

import br.com.utfpr.edu.projeto.modelo.servidor.Contato;
import br.com.utfpr.edu.projeto.modelo.servidor.Endereco;

/**
 *
 * @author Tiago Luiz Gomes
 */
public class Estabelecimento {

    private long id;
    private String nome;
    private long codigoInep, codigo;
    private PeriodoLetivo periodoLetivo;
    private Endereco endereco;
    private Contato contato;
}
