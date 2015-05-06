/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.propostas;

import br.com.utfpr.edu.projeto.modelo.procedimentos.Cancelamento;
import br.com.utfpr.edu.projeto.modelo.utils.DataFracionada;
import java.util.List;

/**
 *
 * @author Cliente
 */
public class PropostaCancelamento {

    private long numero;
    private DataFracionada data;
    private List<Cancelamento> cancelamentos;
}
