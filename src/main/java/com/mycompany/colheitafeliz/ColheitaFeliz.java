/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colheitafeliz;

/**
 *
 * @author raul_sigoli
 */
public class ColheitaFeliz {

    public static void main(String[] args) {
        Fazenda fazenda = new Fazenda();

        // Exibindo o saldo inicial de moedas
        System.out.println("Saldo inicial de moedas: " + fazenda.getMoedas());
        
        // Adicionando animais à fazenda
        Vaca vaca = new Vaca();
        Galinha galinha = new Galinha();
        Ovelha ovelha = new Ovelha();

        fazenda.adicionarAnimal(vaca);
        fazenda.adicionarAnimal(galinha);
        fazenda.adicionarAnimal(ovelha);

        // Alimentando e coletando produção
        fazenda.alimentarAnimal(vaca);
        fazenda.coletarProducaoAnimal(vaca);

        fazenda.alimentarAnimal(galinha);
        fazenda.coletarProducaoAnimal(galinha);

        fazenda.alimentarAnimal(ovelha);
        fazenda.coletarProducaoAnimal(ovelha);
        

        // Exibindo o saldo final de moedas
        System.out.println("Saldo final de moedas: " + fazenda.getMoedas());
    }
}