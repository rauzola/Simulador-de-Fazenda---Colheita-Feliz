/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colheitafeliz;

/**
 *
 * @author raul_sigoli
 */
public class Cultura {
    protected String nome;
    protected int tempoDeCrescimento;
    protected int diasDeCrescimento;
    protected int valorDeVenda;
    protected boolean madura;

    public Cultura(String nome, int tempoDeCrescimento, int valorDeVenda) {
        this.nome = nome;
        this.tempoDeCrescimento = tempoDeCrescimento;
        this.diasDeCrescimento = 0;
        this.valorDeVenda = valorDeVenda;
        this.madura = false;
    }

    // Método para verificar se a cultura está madura
    public boolean isMadura() {
        return madura;
    }

    // Método para simular o crescimento da cultura
    public void crescer() {
        if (diasDeCrescimento < tempoDeCrescimento) {
            diasDeCrescimento++;
            if (diasDeCrescimento >= tempoDeCrescimento) {
                madura = true;
            }
        }
    }

    // Método para colher a cultura, se madura
    public int colher() {
        if (madura) {
            System.out.println(nome + " foi colhido e gerou " + valorDeVenda + " moedas.");
            return valorDeVenda;
        } else {
            System.out.println(nome + " ainda nao está maduro.");
            return 0;
        }
    }
}