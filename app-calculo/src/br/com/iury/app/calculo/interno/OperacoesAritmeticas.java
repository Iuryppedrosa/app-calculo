package br.com.iury.app.calculo.interno;

import java.util.Arrays;

import br.com.iury.app.logging.Logger;

public class OperacoesAritmeticas 
{
	public double soma(double... nums)
	{
		Logger.info("Somando: ");
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
	}
}
 