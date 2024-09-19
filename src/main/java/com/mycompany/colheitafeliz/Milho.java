/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colheitafeliz;

/**
 *
 * @author raul_sigoli
 */
public class Milho extends Cultura {

    public Milho() {
        super("Milho", 5, 10); // Tempo de crescimento = 5 dias, Valor de venda = 10 moedas
    }

    // Sobrescreve o método colher para incluir um bônus, se aplicável
    @Override
    public int colher() {
        if (madura) {
            int bonus = (diasDeCrescimento == tempoDeCrescimento) ? 5 : 0; // Bônus se colhido no dia exato
            System.out.println("Milho foi colhido com um bonus de " + bonus + " moedas!");
            return valorDeVenda + bonus;
        } else {
            System.out.println("Milho ainda nao esta pronto para colheita.");
            return 0;
        }
    }
}