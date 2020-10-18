package pucrs.qp.gametime;

import static pucrs.qp.gametime.DayHours.FULLDAY;
import static pucrs.qp.gametime.DayHours.HALFDAY;

/**
 * 
 * @author marcus.macedo@edu.pucrs.br
 * 
 */
public class App {

	/**
	 * 
	 * @param inicio
	 * @param fim
	 * @return
	 */
	public static int tempoDeJogo(int inicio, int fim) {
		if (inicio == fim) {
			return FULLDAY.buscaTempoEmHoras();
		} else if (fim == (inicio + 12)) {
			return HALFDAY.buscaTempoEmHoras();
		} else {
			if (fim > inicio) {
				return fim - inicio;
			} else {
				int differenceInHours = (inicio - HALFDAY.buscaTempoEmHoras())  - fim;

				return HALFDAY.buscaTempoEmHoras() - differenceInHours;
			}
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int tempoTotal = tempoDeJogo(16, 23);
		System.out.println("O JOGO DUROU " + tempoTotal + " HORA(S)");
	}
}








