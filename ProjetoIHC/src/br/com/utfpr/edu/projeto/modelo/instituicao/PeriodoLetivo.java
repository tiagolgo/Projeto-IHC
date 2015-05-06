/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.instituicao;

import br.com.utfpr.edu.projeto.modelo.procedimentos.Afastamento;
import br.com.utfpr.edu.projeto.modelo.propostas.PropostaCancelamento;
import br.com.utfpr.edu.projeto.modelo.propostas.PropostaSubstituicao;
import br.com.utfpr.edu.projeto.modelo.propostas.PropostaSuprimento;
import java.util.List;

/**
 *
 * @author Tiago Luiz Gomes
 */
public class PeriodoLetivo {

    private long id;
    private String ano;
    private boolean aberto;
    private QuadroServidores quadroServidores;
    private List<PropostaCancelamento> cancelamentos;
    private List<PropostaSuprimento> suprimentos;
    private List<PropostaSubstituicao> substituicoes;
    private List<Afastamento> afastamentos;

}
