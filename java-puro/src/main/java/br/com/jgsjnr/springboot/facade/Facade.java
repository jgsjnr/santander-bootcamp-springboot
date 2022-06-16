/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jgsjnr.springboot.facade;

import br.com.jgsjnr.springboot.facade.subsistema.cep.CepApi;
import br.com.jgsjnr.springboot.facade.subsistema.crm.CrmService;

/**
 *
 * @author junior
 */
public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cidade, estado);
    }
}
