package br.com.iury.app.financeiro;

import br.com.iury.app.calculo.Calculadora;
import br.com.iury.app.calculo.interno.OperacoesAritmeticas;

public class Teste 
{
	public static void main(String[] args)
	{
		Calculadora calc = new Calculadora();
		System.out.print(calc.soma(2, 2, 5));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		
		System.out.println(op.soma(4, 5, 6));
	}
}
