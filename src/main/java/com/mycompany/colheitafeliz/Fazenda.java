/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colheitafeliz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raul_sigoli
 */
public class Fazenda {
    private List<Cultura> culturas;
    private List<Animal> animais;
    private int aguaDisponivel;
    private int fertilizantesDisponiveis;
    private int racaoDisponivel;
    private int moedas;

    public Fazenda() {
        culturas = new ArrayList<>();
        animais = new ArrayList<>();
        aguaDisponivel = 100;
        fertilizantesDisponiveis = 50;
        racaoDisponivel = 50;
        moedas = 100;
    }

    // Métodos para cultura 

    // Métodos para adicionar e gerenciar animais
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void alimentarAnimal(Animal animal) {
        if (racaoDisponivel >= animal.consumoDeRacao) {
            animal.alimentar();
            racaoDisponivel -= animal.consumoDeRacao;
            System.out.println("Racao disponivel apos alimentar: " + racaoDisponivel);
        } else {
            System.out.println("Racao insuficiente para alimentar " + animal.nome);
        }
    }

    public void coletarProducaoAnimal(Animal animal) {
        int producao = animal.coletarProducao();
        moedas += producao;
        System.out.println("Producao coletada. Moedas atuais: " + moedas);
    }

    public int getMoedas() {
        return moedas;
    }

    public int getRacaoDisponivel() {
        return racaoDisponivel;
    }
}