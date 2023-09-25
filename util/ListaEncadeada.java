package util;

public class ListaEncadeada<T extends Comparable<T>>{
	
	public class No<T> {
	
		public T elemento;
		public No<T> proximo;
		
	
		public No(T elemento) {
			this.elemento = elemento;
		}
	}
	
	private No<T> primeiro;
	public No<T> ultimo;
	private int numElementos;
	
	public ListaEncadeada() {
		this.numElementos = 0;
		this.primeiro = null;
		this.ultimo = null;
	}
	
	
	public void add(T elemento) {
		No<T> novo = new No<T>(elemento);
		if(this.primeiro == null) {
			this.primeiro = novo;
			this.ultimo = novo;
			this.numElementos++;
			return;
		}
	
		this.ultimo.proximo = novo;
		this.ultimo = this.ultimo.proximo;
		this.numElementos++;
	}
	
	public int getNumElementos() {
		return this.numElementos;
	}
	
	public int indexOf(T elemento) {
		int pos = 0;
		No<T> atual = this.primeiro;
		while(atual != null) {
			if(atual.elemento == elemento)
				return pos;
			pos++;
			atual = atual.proximo;
		}
		return -1;
	}
	
	public boolean remove(int pos) {
		if(pos < 0 || pos >= this.numElementos)
			return false;
		if(pos == 0) {
			this.primeiro = this.primeiro.proximo;
			if(this.numElementos == 1)
				this.ultimo = null;
		}
		else {
			No<T> atual = this.primeiro;
			for(int i = 0; i < pos - 1; i++)
				atual = atual.proximo;
			atual.proximo = atual.proximo.proximo;
			if(atual.proximo == null)
				this.ultimo = atual;
		}
		this.numElementos--;
		return true;
	}
	
	public boolean remove(T elemento) {
		int pos = this.indexOf(elemento);
		return this.remove(pos);
	}
	
	public T get(int pos) {
		if(pos < 0 || pos >= this.numElementos)
			return null;
		No<T> atual = this.primeiro;
		for(int i = 0; i < pos; i++)
			atual = atual.proximo;
		return atual.elemento;
	}
	
	public boolean add(T elemento, int pos) {
		No<T> atual = this.primeiro;
		No<T> novo = new No<T>(elemento);
		
		if (pos > this.numElementos || pos < 0) {
			System.out.println("Lista vazia!");
			return false;
		} else if (this.primeiro == null) {
			System.out.println("Inseriu o primeiro");
			this.primeiro = novo;
			this.ultimo = novo;
		} else {
			if (atual.proximo == null ) {	
				atual.proximo = novo;
			} else {
				for(int i = 0; i < pos-1; i++) { 
					atual = atual.proximo;
					System.out.println(atual.elemento.toString());
				}
				
				if (pos == this.numElementos-1) { 
					this.ultimo.proximo = novo; 
					this.ultimo = this.ultimo.proximo; 
					}
				 			
				No<T> aux = atual.proximo; 				
				atual.proximo = novo;
				novo.proximo = aux;
			}
		}
		
		this.numElementos++;
		return true;
	}
	
	
	public void sort() {
		for (int i = 0; i < this.numElementos; i++) {
			No<T> atual = this.primeiro;
			No<T> prox = this.primeiro.proximo;
			for (int j = 0; j < this.numElementos-1; j++) {
				if (atual.elemento.compareTo(prox.elemento) < 0) {
					No<T> aux = atual;
					atual = prox;
					prox = aux;
				}
			}
			atual = prox;
			prox = prox.proximo;
		}
	}
	
	public void sorta() {
		No<T> atual = this.primeiro;
		No<T> menor = atual;
		
		No<T> prox = this.primeiro;
		
		for (int i=0;i<this.numElementos;i++) {
			System.out.println(atual.elemento.toString());
			atual = atual.proximo;
			
			for (int j=0;j<this.numElementos-1;j++) {
				if (atual.elemento.compareTo(atual.proximo.elemento) < 0) // Salva o menor valor 
					menor = atual;
			}
			
			No<T> aux = prox.proximo;
			
			this.primeiro = menor;
			
			prox = prox.proximo;
		}
	}
}
