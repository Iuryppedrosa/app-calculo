package br.com.iury.app.calculo;

import br.com.iury.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora 
{
	private OperacoesAritmeticas opAr = new OperacoesAritmeticas();

	public double soma(double... nums) 
	{
		return opAr.soma(nums);
	}
}
