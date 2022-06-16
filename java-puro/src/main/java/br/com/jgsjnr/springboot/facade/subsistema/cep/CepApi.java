/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jgsjnr.springboot.facade.subsistema.cep;


/**
 *
 * @author junior
 */
public class CepApi {
    private static CepApi instancia;
    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        if(instancia == null){
            instancia = new CepApi();
        }
        return instancia;
    }
    
    public String recuperarCidade(String cep){
        return "Araraquara";
        
    }
    public String recuperarEstado(String estado){
        return "SP";
    }
}
