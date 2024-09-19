/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colheitafeliz;

/**
 *
 * @author raul_sigoli
 */
public class Animal {
    protected String nome;
    protected int idade;
    protected int producaoDiaria;
    protected int consumoDeRacao;
    protected boolean alimentado;

    public Animal(String nome, int producaoDiaria, int consumoDeRacao) {
        this.nome = nome;
        this.idade = 0; // Todos os animais começam com idade 0
        this.producaoDiaria = producaoDiaria;
        this.consumoDeRacao = consumoDeRacao;
        this.alimentado = false; // Inicialmente, o animal não está alimentado
    }

    // Método para alimentar o animal
    public void alimentar() {
        this.alimentado = true;
        System.out.println(nome + " foi alimentado.");
    }

    // Método para coletar a produção do animal
    public int coletarProducao() {
        if (alimentado) {
            System.out.println(nome + " produziu " + producaoDiaria + " unidades.");
            alimentado = false; // Após coletar, o animal precisa ser alimentado novamente
            return producaoDiaria;
        } else {
            System.out.println(nome + " nao foi alimentado e nao produziu.");
            return 0;
        }
    }

    // Método para simular o passar de dias (envelhecimento)
    public void passarDia() {
        idade++;
        System.out.println(nome + " agora tem " + idade + " dias de idade.");
    }
}