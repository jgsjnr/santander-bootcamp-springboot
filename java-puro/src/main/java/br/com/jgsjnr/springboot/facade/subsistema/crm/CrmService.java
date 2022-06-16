/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jgsjnr.springboot.facade.subsistema.crm;

/**
 *
 * @author junior
 */
public class CrmService {
    private CrmService(){
        super();
    }
    public static void gravarCliente(String cliente, String cep, String estado){
        System.out.println("Cliente salvo com sucesso");
        System.out.println(cliente);
        System.out.println(cep);
        System.out.println(estado);
    }
    
}
