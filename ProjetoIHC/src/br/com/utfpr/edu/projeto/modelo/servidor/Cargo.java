/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.modelo.servidor;

import br.com.utfpr.edu.projeto.modelo.enumerators.Funcao;
import br.com.utfpr.edu.projeto.modelo.enumerators.LinhaFuncional;
import br.com.utfpr.edu.projeto.modelo.enumerators.Vinculo;
import br.com.utfpr.edu.projeto.modelo.estrutura.Aula;
import java.util.List;

/**
 *
 * @author Cliente
 */
public class Cargo {

    private String dataAdmissao;
    private Vinculo vinculo;
    private Funcao nome;
    private LinhaFuncional linhaFuncional;
    private int cargaHoraria;
    private List<Aula>disciplinas;
}
