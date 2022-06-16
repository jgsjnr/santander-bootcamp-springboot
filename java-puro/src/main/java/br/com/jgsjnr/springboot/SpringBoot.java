/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.jgsjnr.springboot;

import br.com.jgsjnr.springboot.facade.Facade;
import br.com.jgsjnr.springboot.singleton.Singleton;
import br.com.jgsjnr.springboot.singleton.SingletonPreguicoso;
import br.com.jgsjnr.springboot.singleton.SingletonHolder;
import br.com.jgsjnr.springboot.strategy.Comportamento;
import br.com.jgsjnr.springboot.strategy.ComportamentoAgressivo;
import br.com.jgsjnr.springboot.strategy.ComportamentoDefensivo;
import br.com.jgsjnr.springboot.strategy.ComportamentoNormal;
import br.com.jgsjnr.springboot.strategy.Robo;

/**
 *
 * @author junior
 */
public class SpringBoot {

    public static void main(String[] args) {
        //Singleton
        Singleton lazy = Singleton.getInstancia();
        System.out.println(lazy);
        lazy = Singleton.getInstancia();
        SingletonPreguicoso eager = SingletonPreguicoso.getInstance();
        System.out.println(eager);
        eager = SingletonPreguicoso.getInstance();
        System.out.println(eager);
        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        
        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("JJ", "1234567");
    }
}
