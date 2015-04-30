/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.servidor;

import br.com.utfpr.edu.projeto.modelo.servidor.documentos.CadastroPessoaFisica;
import br.com.utfpr.edu.projeto.modelo.servidor.documentos.CarteiraHabiltacao;
import br.com.utfpr.edu.projeto.modelo.servidor.documentos.CarteiraTrabalho;
import br.com.utfpr.edu.projeto.modelo.servidor.documentos.DocumentoMilitar;
import br.com.utfpr.edu.projeto.modelo.servidor.documentos.Identidade;
import br.com.utfpr.edu.projeto.modelo.servidor.documentos.PisPasep;
import br.com.utfpr.edu.projeto.modelo.servidor.documentos.TituloEleitoral;

/**
 *
 * @author Cliente
 */
public class Documentacao {
    private CarteiraHabiltacao carteiraHabilitacao;
    private CarteiraTrabalho carteiraTrabalho;
    private DocumentoMilitar documentoMilitar;
    private Identidade identidade;
    private PisPasep pisPasep;
    private TituloEleitoral tituloEleitoral;
    private CadastroPessoaFisica cpf;
}
