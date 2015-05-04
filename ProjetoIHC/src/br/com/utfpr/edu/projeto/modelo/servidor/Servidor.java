/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.servidor;

import br.com.utfpr.edu.projeto.modelo.enumerators.Sexo;
import java.util.List;

/**
 *
 * @author Cliente
 */
public class Servidor {

    private String nome, tipoSangue;
    private int cargaHoraria;
    private Sexo sexo;
    private Contato contato;
    private List<Dependente> dependentes;
    private Documentacao documentos;
    private Endereco endereco;
    private Filiacao filiacao;
    private Nascimento nascimento;
    private List<Cargo> cargos;

}
