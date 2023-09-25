package controller;

import java.util.Scanner;

import model.Empregado;
import util.FilaEncadeada;
import util.PilhaEncadeada;

public class CtrlPrograma {

	public static void main(String[] args) {
		//
		// Exemplo de Comparable com Strings
		//
		String str1 = "Java";
		String str2 = "Kotlin";
		String str3 = "Java";
		String str4 = "C#";

		int resultado = str1.compareTo(str2);
		/*System.out.println(  resultado );
		System.out.println( str1.compareTo(str3) );
		System.out.println( str1.compareTo(str4) );		*/
		
		// Estamos declarando três variáveis (e1,e2,e3) que são "Ponteiros para um objeto Empregado"
		Empregado e1 = new Empregado(987,"Claudia");
		Empregado e2 = new Empregado(321,"Maria");
		Empregado e3 = new Empregado(123,"Alessandro");
	
		// Estamos declarando uma variável listaEmpregado que é 
		// "ponteiro para um objeto PilhaEncadeada<Empregado>". Repare que, 
		// por ser umaclasse generics, eu já informo que o objeto PilhaEncadeada
		// só poderá guardar objetos Empregado. 
		PilhaEncadeada<Empregado> listaEmpregados = new PilhaEncadeada<Empregado>();
		
		// Adicionamos os três objetos Empregado no MeuArrayDinamico
		listaEmpregados.push(e1);
		listaEmpregados.push(e2);
		listaEmpregados.push(e3);		

		// Estamos declarando a variável "teclado" (ponteiro para Scanner) e estamos instanciando um objeto Scanner 
		Scanner teclado = new Scanner(System.in);		
		// Loop para leitura de Empregado e armazenamento na pilha 
//		while(true) {			
//			System.out.println("Entre com a matrícula do Empregado: ");
//			// Eu prefiro usar "Integer.parseInt(teclado.nextLine())" ao invés de "teclado.nextInt()"
//			int m = Integer.parseInt(teclado.nextLine());
//			System.out.println("Entre com o nome do Empregado: ");
//			String n = teclado.nextLine();
//			
//			// Instanciando um novo objeto Empregado
//			Empregado novo = new Empregado(m,n);
//			// Colocando o novo objeto no MeuArrayDinamico.
//			listaEmpregados.push(novo);
//
//			// Solicito a ordenação da listaEmpregados
//			////// listaEmpregados.sort();
//
//			// Loop para listar os empregados 			
//			System.out.println("Listando os Empregados");
//			System.out.println("======================"); 
//			while(listaEmpregados.getNumElementos() > 0) {
//				Empregado umEmp = listaEmpregados.pop();
//				System.out.println( umEmp.getMatr() + " " + umEmp.getNome()  );
//			}
//		}
		
		
		Empregado e4 = new Empregado(901,"Pedro");
		Empregado e5 = new Empregado(892,"Italo");
		Empregado e6 = new Empregado(394,"Carvalho");
	
		FilaEncadeada<Empregado> filaEmpregados = new FilaEncadeada<Empregado>();
		
		filaEmpregados.push(e1);
		filaEmpregados.push(e2);
		filaEmpregados.push(e3);
		filaEmpregados.push(e4);
		filaEmpregados.push(e5);
		filaEmpregados.push(e6);
		
		System.out.println("Primeiro da fila: " + filaEmpregados);
		System.out.println("Primeiro da fila: " + filaEmpregados);
		System.out.println("Tamanho da fila: " + filaEmpregados.getNumElementos());
		
	}
}