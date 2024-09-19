/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colheitafeliz;

/**
 *
 * @author raul_sigoli
 */
public class Trigo extends Cultura {
    public Trigo() {
        super("Trigo", 2, 5); // Trigo leva 2 dias para crescer e gera 5 moedas ao ser colhido
    }

    @Override
    public int colher() {
        return isMadura() ? super.colher() : 0; // Apenas colhe se estiver maduro
    }
}