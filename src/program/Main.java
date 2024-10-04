package program;

public class Main {

	public static void main(String[] args) {
		CalculadoraRanks calculadora = new CalculadoraRanks(200, 100);
		
		String rank = calculadora.ClassificaRank(200);
		
		System.out.printf("O Herói de saldo %d, está no nível de %s", calculadora.calculaSaldoRankeadas(), rank);
	}

}
