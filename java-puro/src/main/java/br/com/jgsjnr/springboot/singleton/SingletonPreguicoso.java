/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jgsjnr.springboot.singleton;

/**
 *
 * @author junior
 */
public class SingletonPreguicoso {
    private static SingletonPreguicoso instancia = new SingletonPreguicoso();
    private SingletonPreguicoso(){
        super();
    }
    public static SingletonPreguicoso getInstance(){
        return instancia;
    }
    
}
