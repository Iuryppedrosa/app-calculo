module app.calculo 
{
	requires transitive app.logging;
	exports br.com.iury.app.calculo;
	
	exports br.com.iury.app.calculo.interno
	to app.financeiro;
}