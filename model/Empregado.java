package model;
/**
 * Exemplo de classe de dados.
 */
public class Empregado implements Comparable<Empregado> {
	//
	// ATRIBUTOS
	//
	/**
	 * Define a matrícula funcional do empregado
	 */
	private int matr;
	/**
	 * Define o nome do empregado
	 */
	private String nome;
	
	//
	// MÉTODOS
	//
	
	/**
	 * Construtor da classe Empregado, onde devemos informar a 
	 * matrícula funcional e o nome do mesmo.
	 * @param m indica qual é a matrícula do empregado  
	 * @param n indica qual é o nome do empregado
	 */
	public Empregado(int m, String n) {
		this.matr = m;
		this.nome = n;
	}

	public int getMatr() {
		return this.matr;
	}
	
	public void setMatr(int m) {
		this.matr = m;
	}	
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}
	
	/**
	 * Implementação do critério utilizado para a ordenação.
	 */
	public int compareTo(Empregado outro) {
		String nome = this.nome;
		String nomeDoOutro = outro.getNome();		
		int resultado = nome.compareTo(nomeDoOutro);
		return resultado;
		//
		// é o mesmo que this.nome.compareTo(outro.getNome());
		//
	}
	
}