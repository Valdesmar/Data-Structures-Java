package util;

/**
 * Um objeto MeuArrayDinamico é capaz de armazenar referências para objetos <T> 
 * através de um array. Quando esse array estiver cheio e precisar incluir um 
 * novo elemento, o MeuArrayDinamico cria um novo array, copia as referências do 
 * array antigo para o novo, e descarta o antigo. 
 * 
 * @param <T> Indicação da classe dos objetos que serão armazenados pelo MeuArrayDinamico
 */
public class MeuArrayDinamico<T extends Comparable<T>> {
	//
	// CONSTANTES
	//
	final public static int TAMANHO_INICIAL = 5;
	final public static int FATOR_CRESCIMENTO = 3;
	
	//
	// ATRIBUTOS
	//
	/**
	 * Serve para referenciar todos os objetos gerenciados
	 * pelo MeuArrayDinamico
	 */
	private T[]  array;
	/**
	 * Serve para indicar quantos elementos estão presentes
	 * dentro do MeuArrayDinamico
	 */
	private int       numElementos;
	
	//
	// MÉTODOS
	// 
	/**
	 * Construtor da classe MeuArrayDinamico
	 */
	public MeuArrayDinamico() {
		this.array = (T[])new Comparable[TAMANHO_INICIAL];
		this.numElementos = 0;
	}
	
	/**
	 * Adiciona um novo elemento no MeuArrayDinamico
	 * @param elemento referência para o objeto <T> a ser adicionado 
	 */
	public void add(T elemento) {
		// Se o array interno já está lotado, então...
		if(this.array.length == this.numElementos) {
			// 1. Vou criar um novo array
			T[] novoArray = (T[])new Comparable[this.numElementos + FATOR_CRESCIMENTO ];
			for(int i = 0; i < this.numElementos; i++)
				novoArray[i] = this.array[i];
			this.array = novoArray;
			
		}
		this.array[numElementos] = elemento;
		this.numElementos++;
	}

	/**
	 * Retorna a referência a um objeto <T> dado a sua posição no MeuArrayDinamico
	 * @param pos posição do elemento que se quer recuperar
	 * @return referência para o objeto <T> da posição indicada
	 */
	public T get(int pos) {
		if(pos < 0 || pos > this.numElementos - 1)
			return null;
		return this.array[pos];		
	}
	
	/**
	 * Retorna quantos elementos estão armazenados no MeuArrayDinamico
	 * @return
	 */
	public int getNumElementos() {
		return this.numElementos;
	}
	
	/**
	 * Retorna a posição de um elemento no MeuArrayDinamico
	 * @param elemento referência para o objeto procurado
	 * @return a posição do objeto procurado, ou -1 se o
	 * o objeto não fizer parte da coleção. 
	 */
	public int indexOf(T elemento) {
		for(int i = 0; i < this.numElementos; i++) {
			if(this.array[i] == elemento)
				return i;
		}
		return -1;
	}
	
	/**
	 * Remove um elemento do MeuArrayDinamico, se a posição
	 * passada for válida
	 * @param pos posição do objeto a ser retirado da coleção
	 * @return true, caso a posição seja válida; false nos outros casos.
	 */
	public boolean remove(int pos) {
		if(pos < 0 || pos >= this.numElementos)
			return false;
		
		for(int i = pos; i < this.numElementos - 1; i++)
			this.array[i] = this.array[i+1];
		this.array[this.numElementos - 1] = null;
		this.numElementos--;
		return true;
	}
	
	/**
	 * Remove um elemento de MeuArrayDinamico, caso faça parte
	 * da coleção
	 * @param elemento referência para o elemento a ser removido
	 * @return true, caso o elemento faça parte da coleção; false 
	 * nos outros casos.
	 */
	public boolean remove(T elemento) {
		int pos = this.indexOf(elemento);
		return this.remove(pos);
	}
	
	public void sort() {
		for(int i = 0; i < this.numElementos; i++) {
			int posMenor = i;
			for(int j = i+1; j < this.numElementos; j++) {
				if(this.array[j].compareTo(this.array[posMenor]) < 0)
					posMenor = j;
			}
			// Troca dos elementos
			T aux = this.array[i];
			this.array[i] = this.array[posMenor];
			this.array[posMenor] = aux;
		}
	}
	
}