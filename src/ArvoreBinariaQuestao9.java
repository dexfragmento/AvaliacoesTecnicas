/**
 * Arvore binaria que faz a contagem de quantos nós subsequentes existem
 * 
 * @author Filipe Gomes
 * @since 06/12/2017
 *
 */
public class ArvoreBinariaQuestao9 {
	private int valor;
	private ArvoreBinariaQuestao9 left;
	private ArvoreBinariaQuestao9 right;

	public ArvoreBinariaQuestao9(ArvoreBinariaQuestao9 left, ArvoreBinariaQuestao9 right) {
		this.left = left;
		this.right = right;
	}

	public static void contagemNos(final ArvoreBinariaQuestao9 ab, int valor) {
		if (ab.getRight() == null && ab.getLeft() == null) {
			System.out.println(valor);
			System.exit(-1);
		}
		contagemNos(ab.getRight(), valor + 1);
	}

	public static void main(String args[]) {
		final ArvoreBinariaQuestao9 ab = new ArvoreBinariaQuestao9(null, 
				new ArvoreBinariaQuestao9(null,
						new ArvoreBinariaQuestao9(null, 
								new ArvoreBinariaQuestao9(null, null)))); // altere pelos valores desejados
		contagemNos(ab, 0);
	}

	/**
	 * Getters e Setters
	 */
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public ArvoreBinariaQuestao9 getLeft() {
		return left;
	}

	public void setLeft(ArvoreBinariaQuestao9 left) {
		this.left = left;
	}

	public ArvoreBinariaQuestao9 getRight() {
		return right;
	}

	public void setRight(ArvoreBinariaQuestao9 right) {
		this.right = right;
	}

}
