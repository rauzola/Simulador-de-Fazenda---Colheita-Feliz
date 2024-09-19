/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colheitafeliz;

/**
 *
 * @author raul_sigoli
 */
public class Vaca extends Animal {
    public Vaca() {
        super("Vaca", 5, 2); // Produção de 5 litros de leite, consumo de 2 unidades de ração
    }

    @Override
    public int coletarProducao() {
        // Exemplo de um bônus de produção se a vaca for bem alimentada (pode ser ajustado)
        int bonus = alimentado ? 2 : 0;
        return super.coletarProducao() + bonus; // Produção com bônus
    }
}
