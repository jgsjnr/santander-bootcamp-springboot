/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jgsjnr.springboot.singleton;

/**
 *
 * @author junior
 */
public class SingletonHolder {
    private static SingletonHolder instancia;

    private SingletonHolder(){
        super();
    }
    public static SingletonHolder getInstancia(){
        if(instancia == null){
            instancia = new SingletonHolder();
        }
        return instancia;
    }
    
}
