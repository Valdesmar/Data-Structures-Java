package util;

public class PilhaEncadeada<T> {
	//
	// Declaração da classe interna No<T>. Ela só será
	// visível à classe PilhaEncadeada.
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
		public No(T elemento, No<T> anterior) {
			this.elemento = elemento;
			this.anterior = anterior;
		}
	}
	
	//
	// Atributos de PilhaEncadeada
	//
	private No<T>  ultimo;
	private int    numElementos;
	
	//
	// Métodos de PilhaEncadeada
	//
	
	/**
	 * Este construtor não precisaria ser escrito, pois todas
	 * as operações já foram feitas pela inicialização default
	 */
	public PilhaEncadeada() {
		this.numElementos = 0;
		this.ultimo = null;
	}
	
	/**
	 * Adiciona um novo elemento no topo da pilha
	 * @param elemento referência para o novo elemento na pilha
	 */
	public void push(T elemento) {
		No<T> novo = new No(elemento, this.ultimo);
		this.ultimo = novo;
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
		if(this.ultimo == null)
			return null;
		T elemento = this.ultimo.elemento;
		this.ultimo = this.ultimo.anterior;
		this.numElementos--;
		return elemento;
	}
}

