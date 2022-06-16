/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jgsjnr.springboot.strategy;

/**
 *
 * @author junior
 */
public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Andando na defensiva");
    }
    
}
