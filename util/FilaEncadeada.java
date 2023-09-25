package util;

public class FilaEncadeada<T> {
	//
	// Declaração da classe interna No<T>. Ela só será
	// visível à classe FilaEncadeada.
	//
	private class No<T> {
		//
		// Atributos de No
		//
		public T      elemento;
		public No<T>  anterior;
		
		//
		// Métodos
		//
		public No(T elemento) {
			this.elemento = elemento;
		}
	}
	
	//
	// Atributos de FilaEncadeada
	//
	private No<T>  primeiro;
	private int    numElementos;
	
	//
	// Métodos de FilaEncadeada
	//
	
	/**
	 * Este construtor não precisaria ser escrito, pois todas
	 * as operações já foram feitas pela inicialização default
	 */
	public FilaEncadeada() {
		this.numElementos = 0;
		this.primeiro = null;
	}
	
	/**
	 * Adiciona um novo elemento no final da fila 
	 * @param elemento referência para o novo elemento na fila
	 */
	public void push(T elemento) {
		No<T> novo = new No(elemento);
		No<T> atual = this.primeiro;
		
		// Se a fila não tem ninguém...
		if(atual == null) {
			this.primeiro = novo;
			this.numElementos++;
			return;
		}
		
		// Tendo chegado no último, falo que tem um novo último na fila.
		atual.anterior = novo;
		// incremento o número de elementos.
		this.numElementos++;
	}
	
	/**
	 * Informa o número de elementos presentes na pilha
	 * @return número de elementos
	 */
	public int getNumElementos() {
		return this.numElementos;
	}
	
	/**
	 * Retira o último elemento colocado na pilha
	 * @return referência para o último elemento colocado.
	 */
	public T pop() {
		if(this.primeiro == null)
			return null;
		T elemento = this.primeiro.elemento;
		this.primeiro = this.primeiro.anterior;
		this.numElementos--;
		return elemento;
	}
}