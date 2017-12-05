/**
 * A manipulação foi feita em forma de String pra facilitar
 * 
 * @author Filipe Gomes
 * @since 06/12/2017
 *
 */
public class ManipulacaoNumericaQuestao8 {
	public static int gerarC(final String a, final String b) {
		if (a == null || b == null) {
			return -2;
		}
		String c = "";
		final int limite = Math.max(a.length(), b.length());
		for (int i = 0; i <= limite; i++) {
			if (i < a.length()) {
				c += a.charAt(i);
			}
			if (i < b.length()) {
				c += b.charAt(i);
			}
		}
		return c.length() > 6 ? -1 : Integer.valueOf(c.toString());
	}

	public static void executa(final String a, final String b) {
		System.out.println("Valores de entrada: " + a + " - " + b);
		System.out.println("Valores de saída: " + gerarC(a, b));
	}

	public static void main(String args[]) {
		executa("24", "1999"); // altere pelos valores desejados
	}
}
