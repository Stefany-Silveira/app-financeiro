package br.com.stefany.app.financeiro;

import br.com.stefany.app.calculo.Calculadora;

public class Teste {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2, 3, 4));
    }
}